
package eva1_20_antro;

import java.util.Scanner;


public class EVA1_20_ANTRO {


    public static void main(String[] args) {
        //SCANNER
        Scanner input = new Scanner(System.in);
        //VARIABLES
        String usuario;
        int edad;
        int credencial;
        //IMPRIMIR
        System.out.println("******ACCESO AL ANTRO******");
        System.out.print("Introduce tu nombre, apellidos primero, nombre(s) después: ");
        usuario = input.nextLine();
        System.out.print("Introduce tu edad: ");
        edad = input.nextInt();
        //IF STATEMENTS
        if( edad >= 18){
            System.out.println("¿TIENES CREDENCIAL PARA VERIFICAR? SI O NO, ESCRIBE 0 o 1");
                    credencial = input.nextInt();
                    if( credencial == 1){
                        System.out.println("PUEDES ENTRAR");
                    }else{
                        System.out.println("ACCESO DENEGADO");
                    
                    }
        }else{
            System.out.println("NO PUEDES ENTRAR");
        
        }
    }
    
}
