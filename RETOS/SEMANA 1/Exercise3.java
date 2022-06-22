package practice1.g55;

import java.util.Scanner;

/**
 *
 * Crear un programa donde el usuario ingresa un número y el sistema valida si
 * es número es par o impar. El número ingresado debe ser negativo.
 *
 */
public class Exercise3 {

    Scanner scannerInstance = new Scanner(System.in);
    private int number;

    public void NumberNegativeAndEven() {
        System.out.println("\n          Número negativo par o impar");
        System.out.println("        Número: ");
        //Capturamos el número
        number = scannerInstance.nextInt();
        //Validamos si el número es negativo par o impar
        //1. Es negativo
        if (number < 0) {
            if (number % 2 == 0) {
                System.out.println("El número " + number + " es par negativo.");
            } else {
                System.out.println("El número " + number + " es impar negativo.");
            }
        } else {
            System.out.println(number + "*** No cumple con ser negativo ***");
        }
    }

}
