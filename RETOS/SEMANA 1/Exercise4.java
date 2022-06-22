package practice1.g55;

import java.util.Scanner;

/**
 *
 * Crear un programa donde el usuario ingresa un número y el sistema valida si
 * es número es par negativo, de lo contrario vuelve a solicitarle el número,
 * hasta que cumpla dicha restricción
 *
 */
public class Exercise4 {
    //Ciclo while = tiene una condición base de salida hasta que cumpla deja de irerar
    //Ciclo for = tiene un rango {limite_inf, limite_sup} para iterar

    Scanner instanceScanner = new Scanner(System.in);
    private int number;

    public void NumberEvenNegative() {
        //Método que valida que el número ingresado sea par negativo
        System.out.println("\n          Número par negativo");
        System.out.println("        Número: ");
        number = instanceScanner.nextInt();
        //Condición contraria a lo que se solicita
        //par negativo => impar positivo
        while (number % 2 != 0 || number >= 0) {
            System.out.println("        Nuevo intento: ");
            number = instanceScanner.nextInt();
        }
        System.out.println("El número "+ number + " cumple con ser par negativo.");
    }
}
