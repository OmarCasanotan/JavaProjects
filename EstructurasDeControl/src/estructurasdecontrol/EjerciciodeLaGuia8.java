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
public class EjerciciodeLaGuia8 {
    public static void main(String[] args) {
         int nota;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valor de la  nota");
        nota = leer.nextInt();
        while (nota<1||nota >10){
            System.out.println("Ingrese una nueva nota");
            nota = leer.nextInt();
            
        }
        if (nota>=0 || nota<=10);
               System.out.println("La nota es correcta");
             
        }
    }

