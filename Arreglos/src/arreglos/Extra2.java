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
public class Extra2 {
//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de vectores");
        int N = leer.nextInt();
        int[] vectorA = new int[N];
        int[] vectorB = new int[N];

        for (int i = 0; i < N; i++) {
            vectorA[i] = (int) (Math.random() * 9 + 1);
            vectorB[i] = (int) (Math.random() * 9 + 1);
        }
          for (int i = 0; i < N; i++) {
              System.out.print("{" + vectorA[i] + "}");
            
        }
          System.out.println(" ");
          
           for (int i = 0; i < N; i++) {
              System.out.print("{" + vectorB[i] + "}");
              
    }
        System.out.println(" ");
        for (int i = 0; i < N; i++) {
            if (vectorA[i] !=vectorB[i]){
                System.out.println("Los vectores no son iguales");
                break;
                
            }
        }
        
}
