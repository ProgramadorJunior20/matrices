package co.com.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class TareaNumeroAleatorio {
    public static void main(String[] args) {
        /**
         * Pide al usuario que adivine un número aleatorio entre 1 y 100.
         * Si el número ingresado por el usuario es incorrecto, se le debe
         * volver a pedir que lo intente hasta que adivine el número correcto.
         * Cuando adivine el número, se debe mostrar por pantalla un mensaje de felicitación.
         */

        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        //System.out.println(numeroAleatorio);

        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        int numeroIngresado;

        do {
            System.out.println("Adivina el número aleatorio (entre 1 y 100): ");
            numeroIngresado = sc.nextInt();
            intentos++;

            if (numeroIngresado < numeroAleatorio){
                System.out.println("El número ingresado es menor que el número aleatorio.");
            } else {
                if (numeroIngresado > numeroAleatorio){
                    System.out.println("El número ingresado es mayor que el número aleatorio.");
                }
            }

        } while (numeroIngresado != numeroAleatorio);

        System.out.println("¡Felicitaciones! Adivinaste el número aleatorio en " + intentos + " intentos.");
    }
}
