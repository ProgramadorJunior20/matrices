package co.com.matrices;

public class EjemploDeclaraMatriz {
    public static void main(String[] args) {
        /**
         * Continuando con el repaso, vamos a declarar una matriz de 2*2
         */

        int[][] matriz = new int[2][2];

        // Vamos a asignar valores a la matriz
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;

        // Imprimir por consola
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " \t");
            }
            System.out.println();
        }
    }
}
