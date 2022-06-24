package practice1.g55;

import java.util.Scanner;

public class Exercise6 {

    Scanner scannerInstance = new Scanner(System.in);
    private String wifiPassword;
    private int numberAttempts = 1, nro_ingresado = 0, numberAttemptsPatron = 1;

    public void wifiVerification() {
        System.out.println("\n          CONECTARSE A LA RED WIFI");
        System.out.println("        Contraseña de la red: ");
        //Solicitamos el dato al usuario
        wifiPassword = scannerInstance.nextLine();

        while (numberAttempts < 3) {
            if (wifiPassword.equals("ABC123")) {
                System.out.println("Identifica el número faltant que cumpla con la secuencia de números\n"
                        + "| 2 | 9 | 16 | 23 | 30 | 37 | 44 | ? | ");
                //Hacemos lectura del número ingresado por el usuario
                nro_ingresado = scannerInstance.nextInt();
                //Validamos si el valor ingresado es 51
                while (numberAttemptsPatron < 3) {
                    if (nro_ingresado == 51) {
                        System.out.println("Bienvenido al sistema");
                        break;
                    } else {
                        System.out.println("Nuevo intento\n"
                                + "| 2 | 9 | 16 | 23 | 30 | 37 | 44 | ? | ");
                        //Hacemos lectura del número ingresado por el usuario
                        nro_ingresado = scannerInstance.nextInt();
                        //Incrementamos en 1 el contador de intentos del patron
                        numberAttemptsPatron++;
                        if(numberAttemptsPatron == 3){
                            System.out.println("***********Usuario ha sido bloqueado. Hasta pronto.***********");
                        }
                    }
                }
                break;
            } else {
                System.out.println("Contraseña incorrecta");
                System.out.println("        Nuevo intento: ");
                wifiPassword = scannerInstance.nextLine();
                numberAttempts++;
                if (numberAttempts == 3) {
                    System.out.println("Usuario bloqueado");
                }
            }
        }
    }
}
