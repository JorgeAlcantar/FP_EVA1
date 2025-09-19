/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_26_operaciones;

/**
 *
 * @author JORGE
 */
public class EVA1_26_OPERACIONES {


    public static void main(String[] args) {
        //DIVISIONES
        int valor1 = 7, valor2 = 3;
        int resu;
        //
        resu = valor1 / valor2;
        
        System.out.print("7/3 = ");
        System.out.println(resu);
        
        //DIVISIONES
        double v1 = 7.0, v2 = 3.0;
        double resultado;
        //
        resultado = v1 / v2;
        
        System.out.print("7.0/3.0 = ");
        System.out.println(resultado);
        
        //CALCULAR EL RESIDUO
        //RESIDUO = MODULO = %
        int num1 = 2024, num2 = 4;
        int resi;
        resi = num1 % num2;//CALUCLO DEL RESIDUO
        System.out.println("Residuo de 2024 % 4 es: ");
        System.out.println(resi);
        
        //AÑOS BISIESTOS
        if (resi == 0)//división exacta entre 4
            System.out.println("Puede que sea bisiesto");
    }
    
}
