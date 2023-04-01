/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Win10 1909
 */
public class Ej5 {
//Realice un programa que compruebe si una matriz dada es antisimétrica. 
//Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 
//Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] matrizA = { {0,-2,4 },{2,0,2 },{-4,-2,0 }};
       int[][] matrizB = new int [3][3];
       int contador=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[j][i]=matrizA[i][j];  //con esto lo q hacemos es la transpuesta de una 
                
            }
           
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("{" +matrizA[i][j] + "}");  //Es solo print para q haga el cuadrado de una matriz
            }
            System.out.println(" "); //Saltos de linea
        }
        System.out.println(" "); //Salto de linea separacion entre matrices
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("{" +matrizB[i][j] + "}");  //Es solo print para q haga el cuadrado de una matriz
            }
            System.out.println(" "); //Saltos de linea
        }
        System.out.println(" ");
          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizB[i][j]== -matrizA[i][j]) { //El signo negativo adelante de matrizA hace q todo se cambie de signo, es como menos x menos = mas etc
                    contador++;  //contador para q vaya numero x numero
                }
            }
            System.out.println(" "); //Saltos de linea
        }
          System.out.println(" ");
          if (contador==9) {  //es igual a nueve xq es un cuadrado de 3x3 =9
              System.out.println("Es antisimetrica");
            
        }else{
              System.out.println("No es antisimetrica");
          }
    }
   
    
}
