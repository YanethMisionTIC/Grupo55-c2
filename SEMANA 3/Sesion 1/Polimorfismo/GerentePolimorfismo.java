package Polimorfismo;


public class GerentePolimorfismo extends EmpleadoPolimorfismo{
     //1. Atributos: departamento, cantSubordinados
    private String departamento;
    private int cantSubordinados;

    public GerentePolimorfismo(String nombre, double salario, String departamento, int cantSubordinados) {
        super(nombre, salario);
        this.departamento = departamento;
        this.cantSubordinados = cantSubordinados;
    }

    @Override
    public String toString() {
        return super.toString() + ", departamento" + this.departamento
                + ", personas a cargo: " + this.cantSubordinados; 
    }
}
