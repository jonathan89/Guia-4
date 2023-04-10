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
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese un numero");
                int num1 = leer.nextInt();
                
                primo(num1);
                boolean ret = primo(num1);
                if ( ret == true){
                System.out.println("El numero es primo");
                } else {
                    System.out.println("El numero no es primo");
                }
                
            }

            public static boolean primo(int num1){
                  if (num1 <= 1) {
                return false;
                }
                    for (int i = 2; i <= Math.sqrt(num1); i++) {
                        if (num1 % i == 0) {
                            return false;
                        }
                    }
                return true;
            }
}
    
    

