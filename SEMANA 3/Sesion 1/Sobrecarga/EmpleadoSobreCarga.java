package Sobrecarga;


public class EmpleadoSobreCarga {
    protected String nombre;
    protected int idEmpleado;
    protected double salario;
    protected double valorBono;
    protected static int contadorEmpleado;
    
    //Añadir varios constructores de la clase con diferente cant de args
    //1. Constructor sin args
    public EmpleadoSobreCarga() {
        this.idEmpleado = ++EmpleadoSobreCarga.contadorEmpleado;
    }
    
    //2. Constructor con el arg nombre
    public EmpleadoSobreCarga(String nombre) {
        this.nombre = nombre;
        this.idEmpleado = ++EmpleadoSobreCarga.contadorEmpleado;
    }
    
    //3. Constructor con todos los args
    public EmpleadoSobreCarga(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.idEmpleado = ++EmpleadoSobreCarga.contadorEmpleado;
    }
    
    
    //4. Añadir el método toString de la clase
    @Override
    public String toString() {
        return "EmpleadoSobreCarga{" + "nombre=" + nombre 
                + ", idEmpleado=" + idEmpleado 
                + ", salario=" + salario + '}';
    }
    
    //5. Añadimos el constructor con todos los args incluyendo el de valorBono

    public EmpleadoSobreCarga(String nombre, double salario, double valorBono) {
        this.nombre = nombre;
        this.salario = salario;
        this.valorBono = valorBono;
        this.idEmpleado = ++EmpleadoSobreCarga.contadorEmpleado;
    }
    
    public double calcularSalarioConBono(){
        //this.valorBono = this.valorBono * this.salario;
        this.valorBono *= this.salario;
        double salarioPagar = this.salario + this.valorBono;
        return salarioPagar;
    }
    
    public double calcularSalarioConBono(double valorBonoNavidad){
        this.valorBono *= this.salario;
        double salarioPagar = this.salario + this.valorBono + valorBonoNavidad;
        return salarioPagar;
    }
    
}
