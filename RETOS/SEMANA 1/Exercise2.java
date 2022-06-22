package practice1.g55;
//1. Importamos la librería Scanner
import java.util.Scanner;
/**
 *Crear un programa donde el usuario ingresa un número y el sistema valida si 
 * es número es par o impar.
 * @author YanethM
 */
public class Exercise2 {
    //2. Creamos la instancia de la librería Scanner
    Scanner scannerInstance = new Scanner(System.in);
    //3. Determinar las variables de la clase
    private int number;
    
    //4. Creamos el método que solicita la info al usuario y valida
    public void requestUserNumber(){
        System.out.println("\n          Validar si es par o impar");
        System.out.println("        Número: ");
        number = scannerInstance.nextInt();
        //5. Validamos si el número es par o impar
        //MOD en python, % en java
        if(number % 2 == 0){
            System.out.println("El número " + number + " es par.");
        }else{
            System.out.println("El número " + number + " es impar.");
        }
    }
}
