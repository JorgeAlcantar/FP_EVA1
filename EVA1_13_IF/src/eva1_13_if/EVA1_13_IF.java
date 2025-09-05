/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author JORGE
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double califa;
        //ASIGNAR
        Scanner input = new Scanner (System.in);
        //IMPRIMIR
        System.out.println("Introduce la calificación: ");
        califa = input.nextDouble();
        //UTILIZACIÓN DE LLAVES 
        if (califa >= 70) {
            System.out.println("Puedes ir a Disney Land");
        } else {
                System.out.println("AZOTES!!!");
                }
    }
    
}
