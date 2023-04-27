package co.com.ejercicios;

import java.util.Scanner;

public class TareaImprimirSilla {
    public static void main(String[] args) {
        /**
         * Escribir un programa para una matriz de n x n e imprima en ella una silla
         * (o letra h minúscula) construida a base del numero 1 y utilizar el numero 0 como espacio.
         * El tamaño de la silla se basa en una variable n que indicará el tamaño de la figura a imprimir en una matriz de n x n.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz (n * n): ");
        int n = sc.nextInt();

        if (n == 0){
            System.out.print("ERROR");
            System.exit(1);
        }

        int[][] matriz = new int[n][n];

        // Ahora vamos a crear una silla en la matriz utilizando los números 1 y 0. Para eso, necesitamos un bucle que recorra la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((j == 0) || (i == n / 2 && j != 0 && j != n - 1) || (j == n - 1 && i >= n / 2)) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }

        }

        // Imprimimos el resultado
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
