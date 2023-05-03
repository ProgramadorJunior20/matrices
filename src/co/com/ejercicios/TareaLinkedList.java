package co.com.ejercicios;

import java.util.LinkedList;

public class TareaLinkedList {
    public static void main(String[] args) {
        /*
    Repasando LinkedList
     */
        // Crear un LinkedList de Integer
        LinkedList<Integer> miLista = new LinkedList();

        // Agregar elementos a la lista
        miLista.add(1);
        miLista.add(2);

        // Acceder a los elementos de la lista
        int elemento1 = miLista.get(0);
        int elemento2 = miLista.get(1);

        // Eliminar un elemento de la lista
        miLista.remove(0);

        // Imprimir un elemento de la lista por consola
        System.out.println(elemento1);
    }
}
