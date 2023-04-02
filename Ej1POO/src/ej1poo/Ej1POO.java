/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1poo;
//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro
//y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del

import ej1poo.entidades.Libro;
import java.util.Scanner;

//libro y el número de páginas.
/**
 *
 * @author Win10 1909
 */
public class Ej1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); //Esto me va a dejar usar el nextline
        Libro l1 = new Libro();
        l1.cargarLibro();
        l1.MostrarLibro();

    }
}