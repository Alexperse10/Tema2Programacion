package org.example;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Escribe un programa que cuente cuántas veces aparece una subcadena dentro de una cadena, sin usar bucles. Usa como ejemplo las siguientes:
        System.out.println("introduce una frase");
        String texto = sc.nextLine();
        System.out.println("introduce una palabra");
        String subcadena = sc.nextLine();
        String texto_sin_espacios = texto.replace(" ","");

        System.out.println(texto_sin_espacios);

        int cantidad_texto = texto_sin_espacios.length();
        System.out.println(cantidad_texto);
        String sin_mundo = texto_sin_espacios.replace("mundo", "");
        System.out.println(sin_mundo);
        int cantidad_sinmundo = sin_mundo.length();
        System.out.println(cantidad_sinmundo);

        int resta_textos = cantidad_texto - cantidad_sinmundo;
        int cantidad_palabra = subcadena.length();

        System.out.println(resta_textos/cantidad_palabra);
    }
}
