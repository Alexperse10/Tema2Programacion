package org.example;

import java.util.Scanner;

public class analizador_texto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un texto");
        String texto = sc.nextLine();
        int longitud_texto = texto.length();
        System.out.println("la longitud del texto es" +longitud_texto);
        char primera_palabra = texto.charAt(0);
        System.out.println("la primera palabra es:" +primera_palabra);
        char ultima_palabra = texto.charAt(longitud_texto-1);
        System.out.println("la ultimo palabra es: "+ultima_palabra);
        String texto_mayusculas = texto.toLowerCase();
        System.out.println("el texto en minusculas es: "+texto_mayusculas);
        String texto_minusculas = texto.toUpperCase();
        System.out.println("el texto en mayusculas es: "+texto_minusculas);
        String texto_sinespecios = texto.replace(" ","");
        int mitad1_sinespacios = texto_sinespecios.length();
        System.out.println("longitud sin espacios es" +mitad1_sinespacios);
        System.out.println("el texto sin espacios es: "+texto_sinespecios);
        String mitad2 = texto_sinespecios.substring(mitad1_sinespacios/2);
        System.out.println(mitad2);
        String mitad1 = texto_sinespecios.substring(0,mitad1_sinespacios/2);
        System.out.println("la mitad del primer texto es" +mitad1);


    }
}
