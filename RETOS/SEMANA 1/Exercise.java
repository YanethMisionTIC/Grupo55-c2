package practice1.g55;

import java.util.Scanner;

/**
 * Crear un programa que solicita al usuario la contraseña de su wifi, la cual
 * es “ABC123”, sólo tendrá 3 intentos. Al 3 intento incorrecto, el sistema le
 * mostrará un mensaje indicando que ha sido bloqueado.
 *
 */
public class Exercise5 {

    Scanner scannerInstance = new Scanner(System.in);
    private String wifiPassword;
    private int numberAttempts = 1;

    public void VerifyWifiPassword() {
        System.out.println("\n          CONECTARSE A LA RED WIFI");
        System.out.println("        Contraseña de la red: ");
        //Solicitamos el dato al usuario
        wifiPassword = scannerInstance.nextLine();

        //Validamos el dato ingresado
        while (numberAttempts < 3) {
            if (wifiPassword.equals("ABC123")) {
                System.out.println("Contraseña coincide");
                break;
            } else {
                System.out.println("Contraseña incorrecta");
                System.out.println("        Nuevo intento: ");
                wifiPassword = scannerInstance.nextLine();
                numberAttempts++;
                if(numberAttempts ==3){
                    System.out.println("Usuario bloqueado");
                }
            }
        }
    }
}
