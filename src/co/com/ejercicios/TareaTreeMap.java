package co.com.ejercicios;

import java.util.TreeMap;

public class TareaTreeMap {
    public static void main(String[] args) {
        // Crear un TreeMap de String e Integer
        TreeMap<String, Integer> miMap = new TreeMap<>();

        // Agregar elemento al map
        miMap.put("Uno", 1);
        miMap.put("Dos", 2);
        miMap.put("Tres", 3);

        // Acceder a los elementos del map
        int valorUno = miMap.get("Uno"); // Devuelve el entero 1

        // Eliminar un elemento del map
        miMap.remove("Dos");

        // Acceder a los elementos del map
        //int valorDos = miMap.get("Dos"); // Devuelve un error tipo null

        // Imprimir por consola
        System.out.println("Mi Mapa: " + miMap.get("Uno"));
        System.out.println("Mi Mapa: " + valorUno);
        //System.out.println("Mi Mapa: " + valorDos);
        System.out.println("Mi Mapa: " + miMap.get("Dos")); // Devuelve null

    }
}
