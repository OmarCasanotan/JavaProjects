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
public class Ej2 {
    //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba su nombre y apellido");
        nombre = leer.nextLine( );
        System.out.println("Mi nombre es: " + nombre );
                
        
        
    }
}
