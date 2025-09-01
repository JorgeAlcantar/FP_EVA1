/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_temperaturas;

/**
 *
 * @author JORGE
 */
public class EVA1_8_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        double Cel, Fah, Kel;
        //INICIALIZACION
        Fah = 100;
        Cel = (5 * (Fah - 32.0)) / 9.0;
        Fah = ((9.0 * Cel) /5.0) + 32.0;
        Kel = Cel + 273.15;
        //IMPRIMIR
        System.out.println("Las escalas de temperatura de Fahrenheit a celsius, de celsius a fahrenheit y de celsius a kelvin es: ");
        System.out.println(Cel);
        System.out.println(Fah);
        System.out.println(Kel);
        //INICIALIZACION
        Fah = 100;
        Cel = (5 * (Fah - 32.0)) / 9.0;
        //IMPRIMIR
        System.out.print("En la operacion de Fahrenheit a Celsius es: ");
        System.out.println(Cel);
        //INICIALIZACIÓN
        Cel = 37.77777777777778;
        Fah = ((9.0 * Cel) / 5.0) +32.0;
        //IMPRIMIR
        System.out.print("En la operacion de Celsius a Fahrenheit es: ");
        System.out.println(Fah);
        //INICIALIZACION
        Cel = 37.77777777777778;
        Kel = Cel + 273.15;
        System.out.print("En la operacion de Celsius a Kelvin es: ");
        System.out.println(Kel);
        
    }
    
}
