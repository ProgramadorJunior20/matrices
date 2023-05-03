package co.com.ejercicios;

public class TareasEnterosImpares {
    public static void main(String[] args) {
        /**
         * Muestra por pantalla la secuencia de números enteros impares entre 1 y 50.
         */

        for (int i = 0; i < 50; i++){
            if ((i % 2) == 1){
                System.out.println(i);
            }
        }

    }
}
