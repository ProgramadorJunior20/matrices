package co.com.ejercicios;

import java.util.Scanner;

public class TareaImprimirX {
    public static void main(String[] args) {
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
