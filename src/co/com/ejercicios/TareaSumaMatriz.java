package co.com.ejercicios;

public class TareaSumaMatriz {

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }
    public static void main(String[] args) {
        /**
         * Crear un método que reciba dos matrices de enteros como parámetros
         * y que retorne una nueva matriz que contenga la suma de las dos matrices originales.
         */

        int[][] matriz1 = {
                {80, 1000},
                {200, 320}
        };

        int[][] matriz2 = {
                {23, 22},
                {83, 32}
        };

        int[][] resultado = sumarMatrices(matriz1, matriz2);
        System.out.println("La matriz resultante es: ");
        for (int i = 0; i < resultado.length; i++){
            for (int j = 0; j < resultado[i].length; j++){
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
