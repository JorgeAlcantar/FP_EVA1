
package eva1_28_moneda;

import java.util.Scanner;


public class EVA1_28_MONEDA {


    public static void main(String[] args) {
        //ESCOGE EL LADO DE LA MONEDA
        System.out.println("*****LADOS DE UNA MONEDA*****");
        Scanner input = new Scanner(System.in);
        int usuario, numero;
        System.out.println("Elige aguila o sello (1/0): ");
        usuario = input.nextInt();
        //COMO SIMULAR EL LANZAMIENTO DE UNA MONEDA
        //UTILERÍA NUEVA LLAMADA MATH
        Math.random();
        //ELECCIÓN ALEATORIA
        if(Math.random() < 0.5){
            System.out.println("Aguila");
            numero = 1;
        }else{
            System.out.println("Sello");
            numero = 0;      
        }
        if(usuario == numero){
            System.out.println("GANASTE!!!");
        }else{
            System.out.println("PERDISTE");
        }
    }
    
}
