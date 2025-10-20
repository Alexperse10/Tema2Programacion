package org.example;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una frase por teclado");
        String frase = sc.nextLine();

        int numerofrase = frase.length();
        System.out.println("la cantidad de caracteres que tiene la frase: " +numerofrase);

        String frasesinespacios= frase.trim();
        System.out.println("la cantidad de caracteres sin espacios es al principio ni al final: "+frasesinespacios);
        int frasesinespaciosprincipio = frasesinespacios.length();
        System.out.println(frasesinespaciosprincipio);

        String frasesinespaciostotal = frase.replace(" ",""); // los espacios se quitan con replace
        System.out.println(frasesinespaciostotal);

        int calculamitad1 = frase.length()/2;
        System.out.println(calculamitad1);

        String mitad1 = frase.substring(0,calculamitad1);
        String mitad2 = frase.substring(calculamitad1);

        String resultado = " primera mitad del texto es: "+mitad1+" y segunda mitdad del texto es: "+mitad2;

        System.out.println(resultado);

        System.out.println("primera mitad del texto es ".concat(mitad1).concat("y la segunda mitad del texto es ").concat(mitad2));
        System.out.println(resultado);

        String frase_mayuscula = frase.toUpperCase();
        System.out.println(frase_mayuscula);


    }
}
