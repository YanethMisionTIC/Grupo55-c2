/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice1.g55;

/**
 *
 * @author YanethM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Instanciamos las clases del paquete
        Exercise1 exercise1Instance = new Exercise1();
        Exercise2 exercise2Instance = new Exercise2();
        Exercise3 exercise3Instance = new Exercise3();
        Exercise4 exercise4Instance = new Exercise4();
        Exercise5 exercise5Instance = new Exercise5();
        //2. Mediante la instancia de la clase, llamamos los métodos
        exercise1Instance.RquestUserInformation();
        exercise2Instance.requestUserNumber();
        exercise3Instance.NumberNegativeAndEven();
        exercise4Instance.NumberEvenNegative();
        exercise5Instance.VerifyWifiPassword();
    }

}
