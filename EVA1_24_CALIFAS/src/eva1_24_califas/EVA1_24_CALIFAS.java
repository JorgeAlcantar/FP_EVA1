
package eva1_24_califas;

import java.util.Scanner;


public class EVA1_24_CALIFAS {


    public static void main(String[] args) {
        //SCANNER
        Scanner input = new Scanner(System.in);
        //VARIABLES
        int calificacion;
        //Imprimir
        System.out.println("Introduce tu calificacion semestral");
        calificacion = input.nextInt();
        //IF STATEMENTS
        if ( calificacion == 100 || calificacion >= 90){
                System.out.println("Tu calificacion es A");

    }
               else if ( calificacion == 89 || calificacion >=80)
                    System.out.println("Tu calificacion es B");
                       else if ( calificacion == 79 || calificacion >=70)
                    System.out.println("Tu calificacion es C");
                       else if ( calificacion == 69 || calificacion >=60)
                    System.out.println("Tu calificacion es D");
                       else if ( calificacion == 59 || calificacion >=0)
                    System.out.println("Tu calificacion es F");
        
        
        
    }
    
}
