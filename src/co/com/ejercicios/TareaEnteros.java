package co.com.ejercicios;

import java.util.Scanner;

public class TareaEnteros {
    public static void main(String[] args) {
        /**
         * Estamos repasando los conceptos de las secciones anteriores para seguir con clases y objetos.
         *
         * Comenzaremos con una tarea sencilla, por ejemplo.
         * podríamos trabajar en un programa que reciba una lista de números enteros
         * y muestre el número más grande y el más pequeño en esa lista.
         */

        // Para comenzar vamos a crear un arreglo de enteros, y lo vamos a llenar
        int[] numeros = {10, 20, 30, 40, 50};

        // Para encontrar el número más grande y el más pequeño en lista, podemos crear dos variables para guardas estos valores
        int numeroMayor= numeros[0];
        int numeroMenor = numeros[0];

        // Para encotrar el número menor o el mayor, vamos a comparar con un ciclo for
        for (int i = 1; i < numeros.length; i++){

            if(numeros[i] > numeroMayor){
                numeroMayor = numeros[i];
            }

            if(numeros[i] < numeroMenor){
                numeroMenor = numeros[i];
            }

        }

        // Imprimimos los números mayor y menor por consola
        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);

    }
}
