package co.com.ejercicios;

import java.util.Scanner;

public class TareaNumeroEntero {
    public static void main(String[] args) {
        /**
         * Pide al usuario que ingrese un número entero positivo por consola
         * y muestra por pantalla la secuencia de números enteros
         * desde 1 hasta ese número ingresado por el usuario.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero positivo entero por favor: ");
        int numero = sc.nextInt();

        if (numero < 1){
            System.out.println("Debe ingresar un numero entero mayor que '0'.");
        } else {
            int i = 1;
            while (i <= numero){
                System.out.println(i);
                i++;
            }
        }

    }
}
