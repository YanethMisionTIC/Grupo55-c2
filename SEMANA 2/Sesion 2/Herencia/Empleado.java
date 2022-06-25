package Herencia;

public class Empleado extends Persona {

    protected int idEmpleado;
    protected boolean ARL;
    protected double salario;
    protected String puestoTrabajo;
    protected static int contadorEmpleados;

    public Empleado(boolean ARL, double salario, String puestoTrabajo, String _nombre, String _apellidos, String _tipoDocumento, String _documento) {
        super(_nombre, _apellidos, _tipoDocumento, _documento);
        this.ARL = ARL;
        this.salario = salario;
        this.puestoTrabajo = puestoTrabajo;
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }

    @Override
    public String toString() {
        return "{\n" + "    idPersona: " + idPersona
                + ",\n    Empleado N°: " + idEmpleado
                + ",\n    Nombre: " + nombre + " " + apellidos
                + ",\n    Documento: " + tipoDocumento + " " + documento
                + ",\n    ARL: " + ARL
                + ",\n    Salario: " + salario
                + ",\n    Puesto de trabajo: " + puestoTrabajo
                + "\n}";
    }
}
