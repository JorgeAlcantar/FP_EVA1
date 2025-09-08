
package eva1_14_if_votar;

import java.util.Scanner;


public class EVA1_14_IF_VOTAR {


    public static void main(String[] args) {
        //SCANNER
        Scanner input = new Scanner(System.in);
        //DECLARAR VARIABLES
        int year, age;
        System.out.println("Introduce tu año de nacimiento");
        year = input.nextInt();
        //CALCULAR
        age = year - 2025; 
        //IF STATEMENTS
        if (year < 2025){
            System.out.println("Puedes votar.");
        }else{
            System.out.println("No puedes votar."); 
        }
            
    }
    
}
