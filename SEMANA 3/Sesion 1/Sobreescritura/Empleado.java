package Sobreescritura;

public class Empleado{
    //1. Atributos: nombre, idEmpleado, salario
    protected String nombre;
    protected int idEmpleado;
    protected double salario;
    protected static int contadorEmpleado;

    //2. Añadimos el constructor de la clase con todos los args menos el id
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        //3. Inicializamos el contador de empleados
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    //4. Método que muestra la información del objeto:
    // {nombre: "...", salario: 0.0, idEmpleado: #}
    public String obtenerDetalles(){
        return "    {\n     idEmpleado: " + this.idEmpleado
                        + ",\n     nombre: " + this.nombre
                        + ",\n     salario: " + this.salario + " USD" + "\n    }";   
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", idEmpleado=" + idEmpleado + ", salario=" + salario + '}';
    }
}
