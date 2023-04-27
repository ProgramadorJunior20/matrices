package co.com.matrices;

public class EjemploMatrices {
    public static void main(String[] args) {


        int[][] numeros = new int[2][4]; // Daclaramos una matriz con 2 filas y 4 columnas

        // llenamos la fila 1 con 4 columnas
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        // llenamos la fila 2 con 4 columnas
        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;


        // Vamos a imprimir por consola el número de filas, columnas el primer elemento de la matriz y el último

        System.out.println("Número de filas: " + numeros.length);
        System.out.println("Número de columnas: " + numeros[0].length);

        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);
        System.out.println("Ultimo elemento: " + numeros[numeros.length - 1][numeros[1].length - 1]);

        // mostrar los datos leer la información
        int num1 = numeros[0][0];
        int num2 = numeros[0][1];
        int num3 = numeros[0][2];
        int num4 = numeros[0][3];
        int num5 = numeros[1][0];
        int num6 = numeros[1][1];
        int num7 = numeros[1][2];
        int num8 = numeros[1][3];

        System.out.println("num = " + num1);
        System.out.println("num = " + num2);
        System.out.println("num = " + num3);
        System.out.println("num = " + num4);
        System.out.println("num = " + num5);
        System.out.println("num = " + num6);
        System.out.println("num = " + num7);
        System.out.println("num = " + num8);

    }
}
