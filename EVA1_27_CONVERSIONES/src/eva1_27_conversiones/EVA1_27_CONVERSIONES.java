
package eva1_27_conversiones;


public class EVA1_27_CONVERSIONES {


    public static void main(String[] args) {
        //CONVERSIONES
        int temperatura;
        double tempDec = 25.7;
        temperatura = (int)tempDec;//NO SE PUEDE UTILIZAR DECIMALES EN ENTERO Y DOUBLE
        System.out.println(temperatura);
        
        double TempDec2;
        TempDec2 = temperatura;
        System.out.println(TempDec2);
        
        //STRINGS
        String Cade, mensaje;
        Cade = "La temperatura es: ";
        mensaje = Cade + temperatura;//Concatenación
        System.out.println(mensaje);
    }
    
}
