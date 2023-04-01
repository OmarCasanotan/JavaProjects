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
public class Extra5 {
//Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeros;
        int suma = 0;
        System.out.println("Introducir tamaño de vector");
        int n = leer.nextInt();
        int m = leer.nextInt();
        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Introducir numeros");
                matriz[i][j] = leer.nextInt();
                suma += matriz[i][j];
            }

        }
        System.out.println("La suma de la matriz es la siguiente : " + suma);
    }

}
