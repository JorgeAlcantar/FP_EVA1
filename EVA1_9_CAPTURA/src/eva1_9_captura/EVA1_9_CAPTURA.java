
package eva1_9_captura;

import java.util.Scanner;


public class EVA1_9_CAPTURA {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);//CREAMOS EL SCANNER
        String nombre;
        int edad;
        double promedio;
        //COMO CAPTURAR EN JAVA
        System.out.println("Introduce tu nombre completo: ");
        nombre = input.nextLine();//nextLine()---CAPTURA TEXTO
        
        System.out.println("Introduce tu edad: ");
        edad = input.nextInt();
        
        System.out.println("Introduce tu promedio: ");
        promedio = input.nextDouble();
        
        System.out.println("El nombre capturado es: ");
        System.out.println(nombre);
        System.out.println("La edad capturada es: ");
        System.out.println(edad);
        System.out.println("El promedio capturado es: ");
        System.out.println(promedio);
    }
    
}
