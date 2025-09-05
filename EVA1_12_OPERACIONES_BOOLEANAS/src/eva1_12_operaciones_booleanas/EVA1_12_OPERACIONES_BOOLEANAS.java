/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_operaciones_booleanas;

/**
 *
 * @author JORGE
 */
public class EVA1_12_OPERACIONES_BOOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int radio = 5; //DDECLARAR VARIABLES
        boolean res; //true or false
        //como usar los operadores booleanos 
        //CUANDO ES MENOR
        res = radio < 0;
        //IMPRIMIR
        System.out.println("El radio es menor que cero es: ");
        System.out.println(res);
        //CUANDO ES MAYOR
        res = radio > 0; 
        //IMPRIMIR
        System.out.println("El radio es mayor que cero?");
        System.out.println(res);
        //CUANDO SON DISTINTOS
        res = radio != 0;
        //IMPRIMIR
        System.out.println("El radio es diferente a cero?");
        System.out.println(res);
        
        
        
    }
    
}
