
package eva1_19_acceso;

import java.util.Scanner;


public class EVA1_19_ACCESO {
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
        System.out.println();
        
       //CONTRASEÑA
        System.out.print("Contraseña: ");
        contraseña = input.nextLine();
        //CONPARACIÓN
         if(usuario.equals(ACCESO_USUARIO)){
         }else{
             System.out.println("INCORRECTO");
         }
        
            if(contraseña.equals(ACCESO_CONTRA)){
                System.out.println("ACCESO CONCEDIDO");
                    }else{
                    System.out.println("ACCESO DENEGADO");
                    
        }
    }
    
}
