/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Win10 1909
 */
public class Ej1 {
//Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] numeros = new int[100];
       Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            numeros[i]= i+1;   
        }
        for (int i = 100-1; i>=0 ; i--) {
            System.out.println(numeros[i]);
        }
    }
    
}
