package co.com.ejercicios;

import java.util.Scanner;

public class TareaNumeroPrimo {
    public static void main(String[] args) {
        /*
        Pide al usuario que ingrese un número entero positivo por consola
        y muestra por pantalla si dicho número es primo o no.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        boolean esPrimo = true;

        for (int i = 2; i < numero; i++){
            if ((numero % i) == 0){
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es primo.");
        }

        if (!esPrimo) {
            System.out.println(numero + " no es primo.");
        }
    }
}
