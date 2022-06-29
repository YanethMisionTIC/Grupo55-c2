package Polimorfismo;

public class EmpleadoPolimorfismo {
    protected String nombre;
    protected int idEmpleado;
    protected double salario;
    protected static int contadorEmpleado;

    public EmpleadoPolimorfismo(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.idEmpleado = ++EmpleadoPolimorfismo.contadorEmpleado;
    }

    @Override
    public String toString() {
        return "EmpleadoPolimorfismo{" + "nombre: " + nombre 
                + ", idEmpleado: " + idEmpleado 
                + ", salario: " + salario + '}';
    } 
}
