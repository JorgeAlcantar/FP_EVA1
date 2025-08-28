/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_triangulo;

/**
 *
 * @author JORGE
 */
public class EVA1_7_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //AREA DE UN TRAINGULO
        //AREA = (BASE * ALTURA) ENTRE 2;
        double area, base, altura;//variables de tipo double
        //INICIALIZACION
        base = 11;
        altura = 3;
        //SE APLICA LA PRECEDENCIA DE OPERACIONES
        area = (base * altura) / 2.0;//CUIDADO CON DECIMALES Y ENTEROS AL DIVIDIR
        //IMPRIMIR
        System.out.println("El area de un traingulo con base = 11 y altura = 3 es: ");
        System.out.println(area);
    }
    
}
