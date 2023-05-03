package co.com.ejercicios;

import java.util.LinkedList;
import java.util.Scanner;

public class TareaLinked {
    public static void main(String[] args) {

        // Creamos la lista enlazada
        LinkedList<String> listaEnlazada = new LinkedList<>();

        // Creamos el objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese 5 nombres
        System.out.println("Ingrese 5 nombres: ");
        for (int i = 0; i < 5; i++){
            String nombre = sc.nextLine();
            listaEnlazada.add(nombre);
        }

        // Mostramos los nombres ingresados en orden inverso
        System.out.println("Los nombres ingresados en orden inverso son:");
        for (int i = listaEnlazada.size() - 1; i >= 0; i--) {
            System.out.println(listaEnlazada.get(i));
        }
    }
}
