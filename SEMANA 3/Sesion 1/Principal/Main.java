package Principal;
import Sobreescritura.*;
import Sobrecarga.*;
import Polimorfismo.*;
import ClasesAbstractas.*;
import RelacionAgregacion.*;
import ClasesComposicion.*;

public class Main {

    public static void main(String[] args) {
        /*
            **************************************************************
            **********************Sobreescritura**********************
        Requisito: herencia
        */
        //1. Instancia de la superclase "padre"
        Empleado empleado = new Empleado("Jairo", 300);
        System.out.println(empleado.obtenerDetalles());
        
        //2. Instancia de la subclase "hijo"
        Gerente gerente = new Gerente("Jhon", 2000, "Sistemas", 12);
        System.out.println(gerente.obtenerDetalles());
        
         /*
            **************************************************************
            **********************Sobrecarga******************************
        Requisito: herencia
        */
         EmpleadoSobreCarga empleado1 = new EmpleadoSobreCarga();
         System.out.println(empleado1.toString());
         
         EmpleadoSobreCarga empleado2 = new EmpleadoSobreCarga("Javier");
         System.out.println(empleado2.toString());
         
         EmpleadoSobreCarga empleado3 = new EmpleadoSobreCarga("Diego", 4000);
         System.out.println(empleado3.toString());
         
         //En este caso el valor del bono será el 10% del salario
         EmpleadoSobreCarga empleado4 = new EmpleadoSobreCarga("Jacinto", 3000, 0.1);
         System.out.println(empleado4.toString()+ ", salario con bono: " + empleado4.calcularSalarioConBono() + " USD");
         EmpleadoSobreCarga empleado5 = new EmpleadoSobreCarga("Luis", 3000, 0.1);
         System.out.println(empleado5.calcularSalarioConBono(400));
         
         /*
            **************************************************************
            **********************Polimorfismo******************************
         Requisito: herencia y sobreescritura
        */
         EmpleadoPolimorfismo empleado6 = new EmpleadoPolimorfismo("Mario", 1500);
         imprimir(empleado6);
         
         empleado6 = new GerentePolimorfismo("Andres", 1700, "R.R.H.H.", 3);
         imprimir(empleado6);
         
         empleado6 = new Operario("Miguel", 400, true);
         imprimir(empleado6);
         
         /*
            **************************************************************
            **********************Clases abstractas******************************
         Requisito: sobreescritura
        */
         Circulo circulo = new Circulo("Circulo");
         circulo.dibujarFigura();
         circulo.calcularAreaFigura();
         
         Rectangulo rectangulo = new Rectangulo("Rectangulo");
         rectangulo.dibujarFigura();
         rectangulo.calcularAreaFigura();
         
          /*
            **************************************************************
            **********************Relación de agregación******************************
            Palabra clave: ClaseA TIENE ClaseB
            1. Creamos una instancia que utiliza el constructor vacío de la clase
            Lago, para inicializar la colección de patos de la clase Lago
        */
          Lago lago = new Lago();
          // 2. Definimos que la estructura interna de la colección será la de
          //la clase Pato {idPato, nombre}
          lago.patos = new Pato[3];
          
          Pato pato1 = new Pato("Donald");
          Pato pato2 = new Pato("Luis");
          Pato pato3 = new Pato("Pluto");
          
          //3. Añadimos los patos a la colección
          lago.patos[0] = pato1;
          lago.patos[1] = pato2;
          lago.patos[2] = pato3;
          
          //4. Creamos una nueva instancia de la clase Lago que utilice el 
          //constructor que recibe todos los args
          Lago lago1 = new Lago("Laguna negra", "Mediterraneo", lago.patos);
          System.out.println(lago1.toString());
          
          Panal panal = new Panal("Patio");
          System.out.println(panal.toString());
    }
    
    
    /*
     **************************Hace parte del polimorfismo**********************
        1. Creamos un método en la clase Main.java
        2. El método debe ser static para poderlo llamar dentro el contexto
        del método ejecutor que es static
        3. El método nuevo debe recibir como argumento una instancia de la clase
        padre
    */
    public static void imprimir(EmpleadoPolimorfismo empleado){
        //4. Mediante el argumento del método accedemos a los métodos y funciones
        //del padre que estan sobreescritos en sus hijos
        System.out.println(empleado.toString());
    }
}
