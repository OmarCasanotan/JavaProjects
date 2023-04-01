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
public class Extra3 {
//Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        relleno(vector);
        mostrar(vector);
        
    }
    public static void relleno(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int)(Math.random()*9+1);
        }
    }
     public static void mostrar(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("{" + vector[i] + "}");
        }
    }
}
