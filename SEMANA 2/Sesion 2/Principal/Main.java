package Principal;
//1. Importar el paquete de herencia
import Herencia.*;

public class Main {

   
    public static void main(String[] args) {
        //Llamamos la clase persona creando la instancia
        Cliente insCliente = new Cliente("Avenida","Manizales","Lola", "Mejía", "C.C.", "70660606", "lola@gmail.com");
        Empleado insEmpleado1 = new Empleado(true, 4500000, "Ing. de sistemas","Jacinto", "Perez", "C.C.", "70670670");
        Jefe insJefe = new Jefe(15, "Manizales", true, 7000000, "Administrador de empresas", "Raúl", "Sito", "C.C.", "1053811811");
        Operario insOperario = new Operario(true, 5, true, 2000000, "Técnico en construcción", "Jefferson", "Diaz", "C.C.", "1053811820");
        Domiciliario insDomiciliario = new Domiciliario("Moto", 2000, true, 2000000, "Mensajero", "Esneyder", "Gómez", "C.C.", "1053811889");
        //Mediante la instancia accedemos a métodos, funciones o atributos publicos
        System.out.println(insCliente.toString()+ ",\n"); //Lola
        System.out.println(insEmpleado1.toString()+ ",\n"); // Jacinto
        System.out.println(insJefe.toString()+ ",\n"); //Raúl
        System.out.println(insOperario.toString()+ ",\n"); //Jefferson
        System.out.println(insDomiciliario.toString()+ ",\n"); //Esneyder
    }
    
}
