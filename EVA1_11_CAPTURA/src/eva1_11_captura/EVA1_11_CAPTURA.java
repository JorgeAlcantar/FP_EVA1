
package eva1_11_captura;

import java.util.Scanner;


public class EVA1_11_CAPTURA {

    public static void main(String[] args) {
        //CALCULO DE VELOCIDAD
        //CALCULAR LA VELOCIDAD (m/s)
        //DECLARAR VARIABLES Y SCANNER
        double V, d, t, Velocidadkm;;
        Scanner input = new Scanner(System.in);
        //SOLICITAR DISTANCIA (m) Y TIEMPO (s)
        System.out.println("Introduce la distancia: ");
        d = input.nextDouble();
        System.out.println("Introduce el tiempo: ");
        t = input.nextDouble();
        V = d / t;
        System.out.println("La velocidad calculada en metros es: ");
        System.out.print(V);
        System.out.println(" m/s");
        Velocidadkm = V * 1000 / 3600;
        System.out.println("La velociad convertida en km/hr es igual a: ");
        System.out.print(Velocidadkm);
        System.out.println(" km/hr");
        
        
    }
    
}
