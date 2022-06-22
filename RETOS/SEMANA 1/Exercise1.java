package practice1.g55;
//1. Librería para solicitar datos por teclado

import java.util.Scanner;

/**
 * Solicitarle al usuario nombre, género y edad. El programa debe identificar si
 * es hombre o mujer mayor de edad.
 *
 */
public class Exercise1 {

    //2. Creamos una instancia de la librería Scanner
    Scanner scannerInstance = new Scanner(System.in);
    //3. Definimos las variables de la clase
    private String userName;
    private char gender;
    private int age;

    //4. Crear el método que solicita los datos al usuario y valida
    public void RquestUserInformation() {
        System.out.println("            INFORMACIÓN PERSONAL");
        System.out.println("    Nombre: ");
        userName = scannerInstance.nextLine();
        //userName = scannerInstance.next();
        System.out.println("    Género:\n F. Femenino\n M. Masculino\n O. Otro");
        gender = scannerInstance.next().charAt(0);
        //FEMENINO
        //.next() captura FEMENINO
        //|F|E|M|E|N|I|N|O| Cantidad de caracteres = 8
        //|0|1|2|3|4|5|6|7| .charAt(0) = F
        //.next().chartAt(4) = N
        System.out.println("    Edad: ");
        age = scannerInstance.nextInt();
        System.out.println("El usuario ingreso la siguiente información: " + userName + gender + age);
    }
}
