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
public class EjerGuia14 {
//Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] Equipo = new String[5];
    Scanner leer = new Scanner(System.in);

    // Pedir al usuario que ingrese los nombres
    for (int i = 0; i < 5; i++) {
      System.out.print("Ingrese el nombre del compañero de equipo #" + (i+1) + ": ");
      Equipo[i] = leer.nextLine();
    }

    // Imprime el vector
    for (int i = 0; i < Equipo.length; i++) {
      System.out.println(Equipo[i]);
    }
  }
    }
        
      