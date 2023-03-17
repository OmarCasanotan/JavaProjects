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
public class Ej1 {
    //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresar primer numero");
    int num1 = leer.nextInt();
    System.out.println("Ingresar segundo numero");
    int num2 = leer.nextInt();
        System.out.println("La suma es : " + (num1+num2));
}
}