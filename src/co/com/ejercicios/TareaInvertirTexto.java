package co.com.ejercicios;

import java.util.Scanner;

public class TareaInvertirTexto {
    public static void main(String[] args) {
        /**
         * Pide al usuario que ingrese una cadena de texto por consola y
         * muestra por pantalla la cadena de texto invertida.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();

        String aux = "";

        int i = texto.length() - 1;
        while (i >= 0){ // recorrer el texto desde el final hacia el principio
            aux += texto.charAt(i);
            i--;
        }

        System.out.println(aux);
    }
}
