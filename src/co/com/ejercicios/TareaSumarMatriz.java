package co.com.ejercicios;

public class TareaSumarMatriz {

    public static int sumarMatriz(int[][] matriz){
        int suma = 0;

        // Recorremos la matriz con dos ciclos for
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                // sumamos el elemento actual
                suma += matriz[i][j];
            }
        }

        return suma; // Retornamos el valor de suma
    }
    public static void main(String[] args) {
        /**
         *  sumar los elementos de una matriz
         */
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int suma = sumarMatriz(matriz); // creamos una variable de tipo entero llamada suma, llamamos al método sumaMatriz() y le pasamos matriz como parámetro

        System.out.print("La suma de los elementos de la matriz es: " + suma);
    }
}
