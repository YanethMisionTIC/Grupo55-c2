package Herencia;

public class Persona {

    protected int idPersona;
    protected String nombre;
    protected String apellidos;
    protected String tipoDocumento;
    protected String documento;
    protected String email;
    protected static int contadorPersonas;

    //2. Clic secundario > Insert code > Constructor
    public Persona(String _nombre, String _apellidos, String _tipoDocumento, String _documento, String _email) {
        //En color negro se ven los valores que llegan desde el Main
        //En color verde se ven los atributos propios de esta clase
        this.nombre = _nombre;
        this.apellidos = _apellidos;
        this.tipoDocumento = _tipoDocumento;
        this.documento = _documento;
        this.email = _email;
        //Incremento en 1 el atributo estático de la clase, cada vez que se
        //crea una instancia de la clase
        this.idPersona = ++Persona.contadorPersonas;
    }

    public Persona(String nombre, String apellidos, String tipoDocumento, String documento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.idPersona = ++Persona.contadorPersonas;
    }

    // Función que retorna los valores asignados en el constructor a las
    //variables de la clase
    @Override
    public String toString() {
        return "{\n" + "    idPersona: " + idPersona + ",\n    Nombre: "
                + nombre + " " + apellidos + ",\n    Documento: "
                + tipoDocumento + " " + documento + ",\n    Correo: "
                + email + "\n}";
    }

}
