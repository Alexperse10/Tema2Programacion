package org.example;

import java.util.Scanner;

public class positivo_negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String valor;

        System.out.println("introduce un numero");
        numero = sc.nextInt();

        valor = numero<0  ? "negativo" : "positivo";  // positivo y negativo son cadenas de texto por lo tanto el tipo de valor es un string

        System.out.println("el numero es " +valor );
    }
}
