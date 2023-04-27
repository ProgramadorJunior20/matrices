package co.com.matrices;

public class EjemploMatricesColumnasVariable {
    public static void main(String[] args) {
        /**
         * Tamaños de columnas variables en una matriz
         */

        // Instanciamos una matriz de enteros con tres filas dejando la cantidad de columnas en variables
        int[][] matriz = new int[3][];

        matriz[0] = new int[2]; // Filas en la primera posición va a ser igual a 2 columnas
        matriz[1] = new int[3]; // Filas en su segunda posición va a ser igual a 3 columnas
        matriz[2] = new int[4]; // Filas en su tercera posición va a ser igual a 4 columnas

        System.out.println("matriz length: " + matriz.length); // cantidad de filas
        System.out.println("fila 0 length: " + matriz[0].length); // cantidad de columnas en la fila 0
        System.out.println("fila 1 length: " + matriz[1].length); // cantidad de columnas en la fila 1
        System.out.println("fila 2 length: " + matriz[2].length); // cantidad de columnas en la fila 2

        // vamos a llenar la matriz con la multiplicación de filas por columnas (i * c)
        for (int i = 0; i < matriz.length; i++){
            for (int c = 0; c < matriz[i].length; c++){
                matriz[i][c] = (i * c);
            }
        }

        // creamos un for para recorrer los índices de las filas
        // y luego tendremos otro for anidado para recorrer las columnas por cada fila
        for (int i = 0; i < matriz.length; i++){
            for (int c = 0; c < matriz[i].length; c++){
                System.out.print(matriz[i][c] + " \t");
            }
            System.out.println();
        }

    }
}
