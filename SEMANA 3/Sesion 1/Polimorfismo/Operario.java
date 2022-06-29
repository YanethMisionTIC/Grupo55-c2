package Polimorfismo;

public class Operario extends EmpleadoPolimorfismo{
    private boolean manejoMaquinaria;

    public Operario(String nombre, double salario,boolean manejoMaquinaria) {
        super(nombre, salario);
        this.manejoMaquinaria = manejoMaquinaria;
    }

    @Override
    public String toString() {
        String detalleManejoMaquinaria = "";
        
        if(this.manejoMaquinaria == true)
            detalleManejoMaquinaria = " si maneja maquinaria pesada.";
        else
            detalleManejoMaquinaria = " no maneja maquinaria pesada.";
        
        return super.toString() + detalleManejoMaquinaria; 
    }
}
