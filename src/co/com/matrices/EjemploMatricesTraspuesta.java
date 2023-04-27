package co.com.matrices;

public class EjemploMatricesTraspuesta {
    public static void main(String[] args) {
        /**
         * Convertir a la matriz traspuesta
         */

        // matriz original
        int[][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        // mostramos la matriz original
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // matriz traspuesta
        int aux;
        for (int i = 1; i < matriz.length; i++){
            for (int j = 0; j < i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        // mostrar matriz traspuesta
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
