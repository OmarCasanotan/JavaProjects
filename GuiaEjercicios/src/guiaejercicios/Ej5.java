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
public class Ej5 {
    //Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().
    
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Escribir un numero por teclado");
         int num = leer.nextInt();
         int doble = num*2,triple = num*3;
         double raiz = Math.sqrt(num);
         System.out.println("El doble del numero es , " + doble + " el triple del numero es, " + triple + " la raiz del numero, " + raiz);          
                 
     }
    
}
