package Herencia;

public class Domiciliario extends Empleado {

    private int idDomiciliario;
    private String tipoTransporte;
    private static int cantidadDomiciliarios;
    private double propina;

    public Domiciliario(String tipoTransporte, double propina, boolean ARL, double salario, String puestoTrabajo, String _nombre, String _apellidos, String _tipoDocumento, String _documento) {
        super(ARL, salario, puestoTrabajo, _nombre, _apellidos, _tipoDocumento, _documento);
        this.tipoTransporte = tipoTransporte;
        this.propina = propina;
        this.idDomiciliario = ++Domiciliario.cantidadDomiciliarios;
    }

    @Override
    public String toString() {
        return "{\n" + "    idPersona: " + idPersona
                + ",\n    Empleado N°: " + idEmpleado
                + ",\n    Domiciliario N°: " + idDomiciliario
                + ",\n    Nombre: " + nombre + " " + apellidos
                + ",\n    Tipo transporte: " + tipoTransporte
                + ",\n    Propina: " + propina
                + ",\n    Salario: " + salario
                + ",\n    Puesto de trabajo: " + puestoTrabajo
                + "\n}";
    }
}
