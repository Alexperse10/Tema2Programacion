package org.example;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la primera cadena");
        String cadena1 = sc.nextLine();
        System.out.println("introduce la segunda cadena");
        String cadena2 = sc.nextLine();

        int cadena1_numerica = cadena1.length();
        int cadena2_numerica = cadena2.length();

        if (cadena1_numerica>cadena2_numerica) {
            System.out.println("la cadena 1 es mas mayor que la dos");
        } else if (cadena1_numerica<cadena2_numerica) {
            System.out.println("la cadena 1 es menor que la cadena dos  ");
        }else {
            System.out.println("las cadenas son iguales");
        }
    }
}
