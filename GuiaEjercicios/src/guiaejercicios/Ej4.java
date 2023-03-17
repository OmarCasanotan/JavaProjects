/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaejercicios;

import java.util.Scanner;

/**
 *
 * @author Win10 1909
 */
public class Ej4 {
   // Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    public static void main(String[] args) {
     double centigrados,conversion;
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar grados centigrados");
        centigrados = leer.nextDouble();
        conversion = 32 + (9*centigrados/5);
        System.out.println("El resultado de la conversion es:" + conversion );
    }
}
