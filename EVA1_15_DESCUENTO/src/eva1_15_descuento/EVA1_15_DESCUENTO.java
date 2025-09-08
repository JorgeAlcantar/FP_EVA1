
package eva1_15_descuento;

import java.util.Scanner;


public class EVA1_15_DESCUENTO {


    public static void main(String[] args) {
        // asignar SCANNER
        Scanner input = new Scanner(System.in);
        //ASIGNAR VARIABLES
        double pago, dinero;
        System.out.println("Introduce el monto a pagar: ");
        pago = input.nextDouble();
       //IF STATEMENTS
       if (pago > 1000){
           //ASIGNAR VARIABLES DE OPERACIÓN
           double descuento;
           //CALUCLO A REALIZAR PARA DAR RESULTADO
           descuento = (pago * 0.15);
           dinero = pago - descuento;
           //IMPRIMIR PRECIO A PAGAR
           System.out.print("El monto a pagar con descuento es de: ");
           System.out.println(dinero);
       }else{
           System.out.print("El monto a pagar no aplica para descuento: ");
           System.out.println(pago);
       }
       
        
    }
    
}
