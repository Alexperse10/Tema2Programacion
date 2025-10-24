package org.example;

import java.util.Scanner;

public class contador_palabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una frase");
        String frase = sc.nextLine();

        int numero_frase = frase.length();
        String frase_sinespacios = frase.replace(" ","");

    }
}
