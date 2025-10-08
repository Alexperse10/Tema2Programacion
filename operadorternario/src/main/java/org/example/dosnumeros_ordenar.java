package org.example;

import java.util.Scanner;

public class dosnumeros_ordenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int mayor;
        int menor;
        System.out.println("introduce primer numero");
        numero1 = sc.nextInt();
        System.out.println("introduce segundo numero");
        numero2 = sc.nextInt();

        mayor = numero1 > numero2 ? numero1 : numero2;
        menor = numero1 < numero2 ? numero1 : numero2;

        System.out.println("el numero mayor es "+mayor + " el numero menor es " +menor);
    }
}
