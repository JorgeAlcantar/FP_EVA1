
package eva1_21_errores_comunes;


public class EVA1_21_ERRORES_COMUNES {


    public static void main(String[] args) {
        int num1 = 1, num2 = 2;
        //ERRORES
        if(num1 > num2);//ERROR, TERMINA EL IF
        
        if(num1 > num2)
            System.out.println("num1 es mayor");
        else//PERTENECE AL SEGUNDO NO AL PRIMERO
            System.out.println("num2 es mayor");
        
        if(num1 > num2){
        }else{//PERTENECE AL PRIMER IF
            System.out.println("Num2 es mayor");
        }
        
    }
    
}
