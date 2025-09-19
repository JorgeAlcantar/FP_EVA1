
package eva1_25_bisiesto;

import java.util.Scanner;


public class EVA1_25_BISIESTO {

    public static void main(String[] args) {
        //SCANNER
        Scanner input = new Scanner(System.in);
        //VARIABLES
        double year, div1 = 4, div2 = 100, div3 = 400;
        //INTRODUCIR FECHAS
        System.out.println("INTRODUCE TU AÑO QUE DESEAS VERIFICAR QUE SEA BISIESTO: ");
        year = input.nextDouble();
        //OPERACIONES
        double resultado;
        System.out.println("Dividiendo entre 4, si puede llegar a ser divisible sera su residuo igual a cero");
        resultado = year % div1;
        System.out.print("El residuo de la división es: ");
        System.out.println(resultado);
        //IF STATEMENTS
        if(resultado == 0){
        System.out.println("Tu año puede ser bisiesto...verificando para que no sea divisible entre 100 para verificar que sea bisiesto.");
        double resultado2;
            System.out.print("El residuo que resultó de la división de la fecha entre 100 es: ");
        resultado2 = year % div2;
            System.out.println(resultado2);
            if(resultado2 != 0){
            System.out.println("Es año bisiesto.");
            }else{
                  System.out.println("NO ES AÑO BISIESTO, a menos que sea divisible entre 400.");
                  System.out.println("Dividiendo entre 400...");
                  double resultado3;
                  System.out.println("El residuo de la división es: ");
                  resultado3 = year % div3;
                  System.out.println(resultado3);
                  if (resultado3  == 0){
                      System.out.println("Es año bisiesto");
                      
                  }else{
                      System.out.println("No es año bisiesto");
                  }
                }
        }else{
            System.out.println("NO es año bisiesto");
        }
        

    
    }
    
}
