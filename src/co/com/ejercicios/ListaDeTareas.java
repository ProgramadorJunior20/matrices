package co.com.ejercicios;

import java.util.LinkedList;
import java.util.Scanner;

public class ListaDeTareas {
    public static void main(String[] args) {
        LinkedList<String> tareas = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String tarea;

        // Agregar tareas
        System.out.println("Agregar tus tareas. Ingresa 'fin' para terminar.");
        do {
            tarea = sc.next();
            if (!tarea.equals("fin")){
                tareas.add(tarea);
            }
        } while (!tarea.equals("fin"));

        // Mostrar lista de tareas
        System.out.println("Lista de tareas:");
        for (String tareaActual: tareas) {
            System.out.print(tareaActual + " \t");
        }
    }
}
