
package eva1_16_numero_mayor;

import java.util.Scanner;


public class EVA1_16_NUMERO_MAYOR {


    public static void main(String[] args) {
        //DETERMINE EL MAYOR DE NUMEROS 
        //SOLICITAR DOS NUMEROS
        //ASIGNACIÓN DE SCANNER 
        Scanner input = new Scanner(System.in);
        //Asignar variables
        double numberOne, numberTwo;
        System.out.println("Introduce un numero:");
        numberOne = input.nextDouble();
        System.out.println("Introduce otro número: ");
        numberTwo = input.nextDouble();
        //IF STATEMENTS
        if (numberOne > numberTwo){ 
            System.out.print(numberOne);
            System.out.print("es mayor a");
            System.out.println(numberTwo);
        }else{
            System.out.print(numberOne);
            System.out.print(" no es mayor a ");
            System.out.print(numberTwo);
        }
        
        
    }
    
}
