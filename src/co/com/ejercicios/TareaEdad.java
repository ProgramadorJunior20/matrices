package co.com.ejercicios;

import java.util.Scanner;

public class TareaEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad por favor: ");
        int edad = sc.nextInt();

        int aux = 18;

        if (edad >= aux){
            System.out.println("Eres mayor de edad");
        } else {
            if (edad < aux){
                System.out.println("Eres menor de edad");
            }
        }
    }
}
