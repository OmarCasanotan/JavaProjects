/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;
//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.

/**
 *
 * @author Win10 1909
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeros;
        int suma = 0;
        System.out.println("Introducir tamaño de vector");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            System.out.println("Introducir numeros");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma es : " + suma);
    }
}
