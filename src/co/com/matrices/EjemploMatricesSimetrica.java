package co.com.matrices;

public class EjemploMatricesSimetrica {
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
        i = 0;

        while (i < matrizSimetrica.length && simetrica) { // filas de la matriz simétrica
            j = 0;
            while (j < i && simetrica) { // columnas de la matriz simétrica
                if (matrizSimetrica[i][j] != matrizSimetrica[j][i]) { // comparar los valores de la matriz simétrica
                    simetrica = false; // si no son iguales, la matriz no es simétrica
                }
                j++;
            }
            i++;
        }

        if (simetrica) {
            System.out.println("La matriz es simétrica");
        }

        if (!simetrica) {
            System.out.println("La matriz no es simétrica");
        }
    }
}
