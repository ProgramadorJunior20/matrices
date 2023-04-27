package co.com.matrices;

public class EjemploMatricesString2 {
    public static void main(String[] args) {

        String[][] nombres = {{"Pepe", "Pepa"}, {"Josefa", "Jose"}, {"Jeff", "Jeffer"}};

        for (String[] fila: nombres) {
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
