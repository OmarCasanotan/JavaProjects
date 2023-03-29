/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author Win10 1909
 */
public class Ejer6 {
//Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
             int opcion;
       String confir = "N";
       int num1;
       int num2;
       double resultado = 0;
       String S = "S";

       System.out.println("Ingrese un numero");
       num1 = leer.nextInt();

       System.out.println("Ingrese el segundo numero");
       num2 = leer.nextInt();

       do{
           System.out.println("MENU");
           System.out.println("1 - Sumar.");
           System.out.println("2 - Restar.");
           System.out.println("3 - Multiplicar.");
           System.out.println("4 - Dividir.");
           System.out.println("5 - Salir.");
           System.out.println("Elija una opción.");
           opcion = leer.nextInt();
           switch(opcion)
           {
               case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es " + resultado);
                    break;
               case 2:
                   resultado = num1 - num2;
                   System.out.println("El resultado de la resta es " + resultado);
                   break;
               case 3:
                   resultado = num1 * num2;
                   System.out.println("El resultado de la multiplicacion es " + resultado);
                   break;
               case 4:
                   resultado = num1/num2;
                   System.out.println("El resultado de la division es " + resultado);
                   break;

               case 5:
                   System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                   confir = leer.next();
                   break;
               default:
                   System.out.println("la opción es incorrecta");
                   break;

           }

       }while(!confir.substring(0, 1).equalsIgnoreCase("S"));

  


