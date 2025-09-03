/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura;

import java.util.Scanner;

/**
 *
 * @author JORGE
 */
public class EVA1_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SOLICITAR LA TEMPERATURA EN FAHRENHEIT
        Scanner input = new Scanner(System.in);
        double fah, cent;
        //CAPTURA
        System.out.println("Introduce temperatura en grados Fahrenheit: ");
        fah = input.nextDouble();
        //DARLE LA TEMPERATURA EN CENTIGRADOS
        cent = 5 * (fah - 32.0) / 9.0;
        System.out.println("La conversion de grados Fahrenheit a Centigrados es: ");
        System.out.println(cent);
    }
    
}
