package Sobreescritura;


public class Gerente extends Empleado{
    //1. Atributos: departamento, cantSubordinados
    private String departamento;
    private int cantSubordinados;
    
    //2. Añadimos el constructor de la clase con todos los args
    public Gerente(String nombre, double salario, String departamento, int cantSubordinados) {
        super(nombre, salario);
        this.departamento = departamento;
        this.cantSubordinados = cantSubordinados;
    }

    //3. Mediante la palabra reservada super. accedemos a llamar los métodos y 
    // funciones de la clase padre
    // {nombre: "...", salario: 0.0, idEmpleado: #}
    @Override
    public String obtenerDetalles() {
        return "Gerente \n[\n" +super.obtenerDetalles() 
                + ",\n     departamento: " + this.departamento
                + ",\n     personas a cargo: " + this.cantSubordinados 
                + "\n]";
    }
}
