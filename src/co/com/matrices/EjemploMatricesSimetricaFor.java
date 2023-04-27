package co.com.matrices;

public class EjemploMatricesSimetricaFor {
    public static void main(String[] args) {
        /**
         * Matriz Simétrica
         */

        boolean simetrica = true; // bandera

        // declarar e instanciar una matriz simétrica
        int[][] matrizSimetrica = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        int i, j;

        for (i = 0; i < matrizSimetrica.length && simetrica; i++) { // filas de la matriz simétrica

            for (j = 0; j < i && simetrica; j++) { // columnas de la matriz simétrica
                if (matrizSimetrica[i][j] != matrizSimetrica[j][i]) { // comparar los valores de la matriz simétrica
                    simetrica = false; // si no son iguales, la matriz no es simétrica
                }
            }

        }

        if (simetrica) {
            System.out.println("La matriz es simétrica");
        }

        if (!simetrica) {
            System.out.println("La matriz no es simétrica");
        }
    }
}
