package co.com.matrices;

import java.util.Scanner;

public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        /**
         * Buscando elementos en una matriz usando etiquetas y break
         */

        int[][] matrizDeEnteros = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };
        int elementoBuscar;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el elemento entero que desea buscar: ");
        elementoBuscar = sc.nextInt();

        boolean encontrado = false;
        int i;
        int j = 0;

        buscar: for (i = 0; i < matrizDeEnteros.length; i++){
            for (j = 0; j < matrizDeEnteros[i].length; j++){
                if (matrizDeEnteros[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado){
            System.out.println("El elemento" + " " + elementoBuscar + " " + "fue encontrado en las coordenadas " + i + "," + j);
        }

        if (!encontrado){
            System.out.println("El elemento" + " " + elementoBuscar + " " + "no fue encontrado en la matriz");
        }

    }
}
