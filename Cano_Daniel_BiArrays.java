/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package laboratoriodos;
import java.util.Random;
import java.util.Scanner;

public class RojitoTeExtraño {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamano N de la matriz: ");
        int NumeroDeFilas = scanner.nextInt();

        int[][] matriz = new int[NumeroDeFilas][NumeroDeFilas];

        for (int filas = 0; filas < NumeroDeFilas; filas++) {
            for (int colunmas = 0; colunmas < NumeroDeFilas; colunmas++) {
                matriz[filas][colunmas] = random.nextInt(90)+10; 
            }
        }

        int Suma1 = 0,Suma2 = 0;
        
        for (int filas = 0; filas < NumeroDeFilas; filas++) {
            for (int colunmas = 0; colunmas < NumeroDeFilas; colunmas++) {
                if (filas == colunmas) {
                    Suma1 += matriz[filas][colunmas];
                } else if (filas + colunmas == NumeroDeFilas - 1) {
                    Suma2 += matriz[filas][colunmas];
                }
            }
        }

        System.out.println("Matriz generada:");
        for (int filas = 0; filas < NumeroDeFilas; filas++) {
            for (int colunmas = 0; colunmas < NumeroDeFilas; colunmas++) {
                System.out.print(matriz[filas][colunmas] + " ");
            }
            System.out.println();
        }

            System.out.println("Suma desde la esquina superior izquierda hasta la esquina inferior derecha.: " + Suma1);
            System.out.println("Suma desde la esquina superior derecha hasta la esquina inferior izquierda.: " + Suma2);
    }
}
