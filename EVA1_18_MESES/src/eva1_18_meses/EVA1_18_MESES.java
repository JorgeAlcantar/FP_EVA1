/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_meses;

import java.util.Scanner;

/**
 *
 * @author JORGE
 */
public class EVA1_18_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SCANNER
        Scanner input = new Scanner(System.in);
        //Variables
        int mes;
        System.out.println("Intorduce el numero que indique el mes: ");
        mes = input.nextInt();
        //IF STATEMENTS
        if( mes == 1){
            System.out.println("Enero");
        }else if( mes == 2){System.out.println("Febrero");
        }else if( mes == 3){System.out.println("Marzo");
        }else if( mes == 4){System.out.println("Abril");
        }else if( mes == 5){System.out.println("Mayo");
        }else if( mes == 6){System.out.println("Junio");
        }else if( mes == 7){System.out.println("Julio");
        }else if( mes == 8){System.out.println("Agosto");
        }else if( mes == 9){System.out.println("Septiembre");
        }else if( mes == 10){System.out.println("Octubre");
        }else if( mes == 11){System.out.println("Noviembre");
        }else if( mes == 12){System.out.println("Diciembre");
        }else{
            System.out.println("El número de mes no es válido");
        
        
        
        
        }
        
        
        
    }
    
}
