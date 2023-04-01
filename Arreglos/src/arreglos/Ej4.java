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
public class Ej4 {
//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
    //La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];
        //Relleno la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);   
            }
        }
        //Muestro la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
         
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        //Calculo la matriz transpuesta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizT[j][i] = matriz[i][j];
            }

        }
        System.out.println(" ");
        System.out.println("La matriz transpuesta es la siguiente: ");
        System.out.println(" ");
        
        //Muestro la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matrizT[i][j]+" ");
            }
            System.out.println(" ");
             