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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int diagonales = 0, filas = 0, columna = 0, cont = 0;

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese un numero para columna " + i + " y fila " + j);
                matriz[i][j] = leer.nextInt();
                filas += matriz[0][j];
                columna += matriz[i][0];

                if (filas == columna) {
                    cont++;
                }

            }

        }
        if (cont >= 3) {
            System.out.println("la matriz es magica");
        } else {
            System.out.println("la matriz no es magica");
        }
    }
}
