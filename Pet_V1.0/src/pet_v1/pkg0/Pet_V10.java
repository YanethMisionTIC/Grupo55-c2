/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet_v1.pkg0;

/**
 *
 * @author YanethM
 */
public class Pet_V10 {

    //1. Declarar globalmente e inicializar las variables
    private static String petName = "Dante";
    private static int age = 3;
    private static int bornYear = 2018;
    private static String breed = "Cooker";
    private static String healthStatus = "Esta bien";
    private static String color = "Cafe";

    //2. Método que imprime la información de la mascota
    public static void showPetInformation() {
        //sout + tab
        System.out.println("Mi mascota se llama " + petName + " tiene " + age + " años, es de raza " + breed + "\nNacio en el año " + bornYear + " y es de color " + color);
    }

    //3. Función que imprime la información de la mascota
    public static String showPetInformationFunction(){
        return "Mi mascota se llama " + petName + " tiene " + age + " años, es de raza " + breed + "\nNacio en el año " + bornYear + " y es de color " + color;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        showPetInformation();
        //Una función debe de imprimirse cuando se llama
        System.out.println(showPetInformationFunction());
    }

}
