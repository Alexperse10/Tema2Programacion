package org.example;

import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero = sc.nextInt();
        String comienzo = "0,1";
        String sin_comas = comienzo.replace(",","");
        char primernumero = sin_comas.charAt(0);
        char segundonumero = sin_comas.charAt(1);
        int primernumero_int = Integer.parseInt(String.valueOf(0));
        int segundonumero_int = Integer.parseInt(String.valueOf(1));
        int sumaprimerasecuencia = primernumero_int + segundonumero_int;
        for (int i=0; i<numero; i++){


        }

    }
}
