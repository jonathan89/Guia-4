/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_4;

import java.util.Scanner;

/**
 *
 * @author Yesica Rocio Gill
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea una aplicación que le pida dos números al usuario y 
        //este pueda elegir entre sumar, restar, multiplicar y dividir.
        //La aplicación debe tener una función para cada operación
        //matemática y deben devolver sus resultados para imprimirlos 
        //en el main.
        Scanner var = new Scanner (System.in);
        System.out.println("Ingrese 2 números: ");
        int num1=var.nextInt();
        int num2=var.nextInt();        
       
        System.out.println("Seleccione una opción: \n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n");
            int opc = var.nextInt(); 
        do {
            switch (opc) {
                case 1:
                    System.out.println("La suma es de "+num1+num2+".");
                    break;
                case 2:
                    System.out.println("La resta es de "+(num1-num2)+".");
                    break;
                case 3:
                    System.out.println("La multiplicación es de "+(num1*num2)+".");
                    break;
                case 4:
                    System.out.println("La división es de "+(num1/num2)+".");
                    break;
            }
        } while (opc>4);
        
                        
        
    }
    
}
