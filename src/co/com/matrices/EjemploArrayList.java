package co.com.matrices;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {

        // Crear un arrayList vacio de tipo String
        ArrayList<String> listaDeNombres = new ArrayList<>();

        // Agregar elementos al arrayList
        listaDeNombres.add("Juan");
        listaDeNombres.add("Jeff");
        listaDeNombres.add("Andi");
        listaDeNombres.add("Dani");
        listaDeNombres.add("Disla");
        listaDeNombres.add("Tisan");
        listaDeNombres.add("Viejo");

        // Imprimir el arrayList
        System.out.println(listaDeNombres);

        // Acceder a un elemento del arrayList
        String ultimoNombre = listaDeNombres.get(6);
        System.out.println("El ultimo nombre de lista es: " + ultimoNombre);
        System.out.println();

        // Eliminar un elemento del ArrayList
        listaDeNombres.remove(4);

        // Recorrer el arrayList con el bucle for
        System.out.println("Recorriendo el arrayList:");
        for (int i = 0; i < listaDeNombres.size(); i++){
            String nombre = listaDeNombres.get(i);
            System.out.println("Nombre #" + (i + 1) + ": " + nombre);
            //System.out.println(listaDeNombres.get(i));
        }

    }
}
