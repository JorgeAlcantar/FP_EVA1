/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_acceso.tablas;

import java.util.Scanner;

public class EVA1_22_ACCESOTABLAS {

        //CONSTANTES---JAVA
    final static String ACCESO_USUARIO = "WILLIAM";
    final static String ACCESO_CONTRA = "1987";
    //final static PI = 3.1416;

    public static void main(String[] args) {
        
        //AIGNACIÓN Y VARIABLES
        String usuario, contraseña;
        Scanner input = new Scanner(System.in);
        
        //IMPRIMIR
        System.out.println("*****CONTROL DE ACCESO*****");
        System.out.println("Freddy Fazbea´s Pizza");
        System.out.print("Usuario: ");
        usuario = input.nextLine();
        
       //CONTRASEÑA
        System.out.print("Contraseña: ");
        contraseña = input.nextLine();
        
         //COMPARACIÓN DE OPERADOR AND 
    if(usuario.equals(ACCESO_CONTRA) && contraseña.equals(ACCESO_CONTRA)){
        System.out.println("ACCESO DENEGADO");
    }else{
            System.out.println("ACCESO CONCEDIDO");
            }
       
    }
    
}
