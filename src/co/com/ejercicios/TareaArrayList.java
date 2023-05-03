package co.com.ejercicios;

import java.util.ArrayList;

public class TareaArrayList {
    public static void main(String[] args) {
        /**
         * Repasando arrayList
         */
        // Crear un arrayList de String
        ArrayList<String> miLista = new ArrayList<>();

        // Agregar Elemento a la lista
        miLista.add("Hola");
        miLista.add("Mundo");

        // Acceder a los elementos de la lista
        String elemento1 = miLista.get(0);
        String elemento2 = miLista.get(1);

        // Eliminar un elemento de la lista
        miLista.remove(0);

        try {
            // Imprimir por consola elementos de la lista
            System.out.println(miLista.get(2));
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR! " + e.getMessage());
        }

    }
}
