package Herencia;

public class Cliente extends Persona{
    private int idCliente;
    private String direccion;
    private String ciudad;
    private static int contadorClientes;

    public Cliente(String direccion, String ciudad, String _nombre, String _apellidos, String _tipoDocumento, String _documento, String _email) {
        super(_nombre, _apellidos, _tipoDocumento, _documento, _email);
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.idCliente = ++Cliente.contadorClientes;
    }

    @Override
    public String toString() {
        return "{\n" + "    idPersona: " + idPersona
                + ",\n    Cliente n°: " + idCliente
                + ",\n    Nombre: " + nombre + " " + apellidos
                + ",\n    Documento: " + tipoDocumento + " " + documento
                + ",\n    Dirección: " + direccion
                + ",\n    Ciudad: " + ciudad
                + "\n}";
    }    
}
