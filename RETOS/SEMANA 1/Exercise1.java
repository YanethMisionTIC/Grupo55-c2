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
        
        //5. Iniciamos el bloque condicional
        if(age >= 18){
            //Mayor de edad
            // or en python, || en java
            // and en python, && en java
            if(gender == 'f' || gender == 'F'){
                System.out.println(userName + ", mujer mayor de edad");
            }else if(gender == 'm' || gender == 'M'){
                System.out.println(userName + ", hombre mayor de edad");
            }else if(gender == 'o' || gender == 'O'){
                System.out.println(userName + ", otro género mayor de edad");
            }else{
                //Escenario de error
                System.out.println("Género seleccionado no existe.");
            }
        }else{
            //Menor de edad
            //Escenario de error
            if(gender != 'f' && gender != 'F' && gender != 'm' && gender != 'M' && gender != 'o' && gender != 'O'){
                System.out.println("Género seleccionado no existe.");
            }else if(gender == 'f' || gender == 'F'){
                System.out.println(userName + ", mujer menor de edad");
            }else if(gender == 'm' || gender == 'M'){
                System.out.println(userName + ", hombre menor de edad");
            }else{
                System.out.println(userName + ", otro género menor de edad");
            }
        }
    }
}
