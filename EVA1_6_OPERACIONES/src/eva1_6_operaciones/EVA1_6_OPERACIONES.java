
package eva1_6_operaciones;


public class EVA1_6_OPERACIONES {

    public static void main(String[] args) {
        //DECLARACION DE VARIABLES
        double radio;
        double area;
        double pi;
        //DECLARACION DE VARIABLES
        //AREA DE UN CIRCULO
        //INICIALIZACION
        pi = 3.1416;
        radio = 5;
        area = pi * radio * radio;
        //IMPRIMIR
        System.out.println("El area de un circulo con radio = 5 es: ");
        System.out.println(area);
        //NUEVO CIRCULO RADIO 100
        radio = 100;
        area = pi * radio * radio;
        System.out.println("El area de un circulo con radio = 100 es: ");
        System.out.println(area);
    }
    
}
