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
public class Extra4 {
//Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double [] vector = new double [10]; //double ya que el promedio da con coma
        int primeraNota = 0;
        int segundaNota = 0;
        int terceraNota = 0;
        int cuartaNota = 0;
        int aprobados=0;//son contadores
        int desaprobados=0; // son contadores
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del alumno " + (i+1));  
            System.out.println("Introducir nota de trabajo practico");
             primeraNota=leer.nextInt();
             System.out.println("Introducir nota de segundo trabajo");
             segundaNota=leer.nextInt();
             System.out.println("Introducir nota de tercer trabajo ");
             terceraNota=leer.nextInt();
             System.out.println("Introducir nota de cuarto trabajo");
             cuartaNota=leer.nextInt();
             
             
             vector[i] = (0.1*primeraNota + 0.15*segundaNota + 0.25*terceraNota + 0.50*cuartaNota); //con esto saco el promedio de todos los alumonos
            if (vector[i]>=7 ) {
                aprobados++;
            }else{
                desaprobados++;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es : " + aprobados);
        System.out.println("La cantidad de alumnos desaprobados es: " + desaprobados);
    }

}
