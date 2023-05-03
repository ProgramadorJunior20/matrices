package co.com.ejercicios;

import java.util.HashSet;

public class TareaHashSet {
    public static void main(String[] args) {

        // Crear un HashSet de String
        HashSet<String> miSet = new HashSet();

        // Agregar elementos al set
        miSet.add("Amarillo");
        miSet.add("Azul");
        miSet.add("Rojo");

        // Verificar si un elemento esta presente en el set
        boolean contieneNegro = miSet.contains("Back");

        // Eliminar un elemento del set
        miSet.remove("Azul");

        // Verificar si un elemento esta presente en el set
        boolean contieneAzul = miSet.contains("Azul");

        // Imprimir por consola
        System.out.println("Contiene Negro: " + contieneNegro);
        System.out.println("Contiene Azul: " + contieneAzul);

    }
}
