package org.example;

import java.util.Scanner;

public class par_o_impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String valor;
        System.out.println("introduce un numero");
        numero = sc.nextInt();

        valor = (numero%2==0) ? "par" : "impar";
        System.out.println("el numero es "+valor);
    }
}
