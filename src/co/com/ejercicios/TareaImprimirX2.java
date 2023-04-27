package co.com.ejercicios;

import java.util.Scanner;

public class TareaImprimirX2 {
    public static void main(String[] args) {
        /**
         * Imprimir una X en la matriz
         *
         */
        /**
         * Escribir un programa que imprima una X construida a base de la letra X
         * en las diagonales de la matriz y utilizar el carácter guion bajo como relleno.
         * El tamaño de la x se basa en una variable n que indicará el tamaño de la letra
         * para imprimir en una matriz de n x n.
         *
         * El carácter "X" en mayúscula y el guion bajo "_" para los espacios.
         *
         * Por ejemplo para n=5 se obtiene:
         *
         * X___X
         * _X_X_
         * __X__
         * _X_X_
         * X___X
         * Por ejemplo para n=6 se obtiene:
         *
         * X____X
         * _X__X_
         * __XX__
         * __XX__
         * _X__X_
         * X____X
         * Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();

        if (n == 0){
            System.out.println("ERROR");
            return;
        }

        char[][] matriz = new char[n][n];

        // ahora recorremos la matriz y vamos colocando las X en las diagonales y los guiones bajos,
        // en el resto de las posiciones
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j || i == n - j - 1){
                    matriz[i][j] = 'X';
                }
                if (!(i == j || i == n - j - 1)) {
                    matriz[i][j] = '_';
                }
            }
        }

        // Imprimimos los resultados
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }
}
