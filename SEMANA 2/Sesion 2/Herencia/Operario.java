package Herencia;


public class Operario extends Empleado{
    private int idOperario;
    private boolean maquinariaPesada;
    private int nivelRiesgoArl;
    private static int cantidadOperarios;

    public Operario(boolean maquinariaPesada, int nivelRiesgoArl, boolean ARL, double salario, String puestoTrabajo, String _nombre, String _apellidos, String _tipoDocumento, String _documento) {
        super(ARL, salario, puestoTrabajo, _nombre, _apellidos, _tipoDocumento, _documento);
        this.maquinariaPesada = maquinariaPesada;
        this.nivelRiesgoArl = nivelRiesgoArl;
        this.idOperario = ++Operario.cantidadOperarios;
    }

    @Override
    public String toString() {
        return "{\n" + "    idPersona: " + idPersona
                + ",\n    Empleado N°: " + idEmpleado
                + ",\n    Operario N°: " + idOperario
                + ",\n    Nombre: " + nombre + " " + apellidos
                + ",\n    Maquinaria pesada: " + maquinariaPesada
                + ",\n    Nivel riesgo ARL: " + nivelRiesgoArl
                + ",\n    Salario: " + salario
                + ",\n    Puesto de trabajo: " + puestoTrabajo
                + "\n}";
    }
}
