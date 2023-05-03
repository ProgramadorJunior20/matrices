package co.com.ejercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TareaCadenaTexto {
    public static void main(String[] args) {
        /**
         * Pide al usuario que ingrese una cadena de texto por consola y muestra por
         * pantalla las vocales que contiene dicha cadena.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese una cadena de texto: ");
        String cadena = sc.nextLine();
        String vocales = "";

        int i = 0;

        do {

            char c = cadena.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                vocales += c;
            }

            i++;

        } while (i < cadena.length());

        System.out.println("Las vocales en la cadena de texto son: " + vocales);
    }
}
