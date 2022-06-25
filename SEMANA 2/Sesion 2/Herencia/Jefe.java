package Herencia;

public class Jefe extends Empleado {

    private int idJefe;
    private int cantSubordinados;
    private String sede;
    private static int contadorJefes;

    public Jefe(int cantSubordinados, String sede, boolean ARL, double salario, String puestoTrabajo, String _nombre, String _apellidos, String _tipoDocumento, String _documento) {
        super(ARL, salario, puestoTrabajo, _nombre, _apellidos, _tipoDocumento, _documento);
        this.cantSubordinados = cantSubordinados;
        this.sede = sede;
        this.idJefe = ++Jefe.contadorJefes;
    }

    @Override
    public String toString() {
        return "{\n" + "    idPersona: " + idPersona
                + ",\n    Empleado N°: " + idEmpleado
                + ",\n    Jefe N°: " + idJefe
                + ",\n    Nombre: " + nombre + " " + apellidos
                + ",\n    Subordinados: " + cantSubordinados
                + ",\n    Sede: " + sede
                + ",\n    Salario: " + salario
                + ",\n    Puesto de trabajo: " + puestoTrabajo
                + "\n}";
    }
}
