
package eva1_23_compras;

import java.util.Scanner;


public class EVA1_23_COMPRAS {


    public static void main(String[] args) {
        //SCANNER 
        Scanner input = new Scanner(System.in);
        //VARIABLES
        String Y, N;
        
        System.out.println("****ALSUPER****");
        System.out.println("¿Cuenta con tarjeta de credito(Y/N)?");
        Y = input.nextLine();
        System.out.println("¿Cuenta con efectivo");
        N = input.nextLine();
        //COMPARACIÓN
        if(Y.equals("Y") || N.equals("Y")){
            System.out.println("PUEDES PROCEDER CON EL PAGO");
    }else{
            System.out.println("NO PUEDES PROCEDER CON EL PAGO");
            }
    }
    
}
