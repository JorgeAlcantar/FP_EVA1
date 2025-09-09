
package eva1_17_if_anidado;

import java.util.Scanner;


public class EVA1_17_IF_ANIDADO {


    public static void main(String[] args) {
        //SCANNER Y VARIABLES
        int dia;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un día de la semana: ");
        dia = input.nextInt();
        //IF ANIDAD (else - if)
        if(dia == 1){
            System.out.println("Domingo");
            }else if(dia == 2){System.out.println("lunes");
            }else if(dia == 3){System.out.println("Martes");
            }else if(dia == 4){System.out.println("Miercoles");
            }else if(dia == 5){System.out.println("Jueves");
            }else if(dia == 6){System.out.println("Viernes");
            }else if(dia == 7){System.out.println("Sabado");
            }else{//OPCIONAL
                System.out.println("Dia de la semana no válido");
        }
    }
    
}
