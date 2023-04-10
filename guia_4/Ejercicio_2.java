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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Diseñe una función que pida el nombre y la edad de N personas 
        //e imprima los datos de las personas ingresadas por teclado e indique 
        //si son mayores o menores de edad. Después de cada persona, el programa
        //debe preguntarle al usuario si quiere seguir mostrando personas y frenar 
        //cuando el usuario ingrese la palabra “No”.
        Scanner var = new Scanner(System.in);
        String opcion = "si";
        do {
            System.out.println("Ingrese su nombre: ");
            String nombre = var.nextLine();
            System.out.println("Ingrese su edad: ");
            int edad= var.nextInt();
            if (edad <=17) {
                System.out.println("Su nombre es "+nombre+" y es menor de edad.");
            } else {
                System.out.println("Su nombre es"+nombre+" y es mayor de edad.");
            }
            System.out.println("¿Desea seguir ingresando datos? Si/No ");
            opcion=var.next();
            opcion.toLowerCase();
        } while ("si".equals(opcion));
    }
    
}
