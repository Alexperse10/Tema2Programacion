package org.example;

import java.util.Scanner;

public class repara_numero_tarjeta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de tarjeta:");
        String numero_tarjeta = sc.nextLine();

        // Verificar longitud
        if (numero_tarjeta.length() != 4) {
            System.out.println("La cantidad de números es incorrecta");
            return;
        }

        // Buscar posición del '?'
        int posicion = numero_tarjeta.indexOf('?');
        if (posicion == -1) {
            System.out.println("No hay ningún signo '?' en la tarjeta");
            return;
        }

        // Probar todos los posibles números del 0 al 9
        for (int posible = 0; posible <= 9; posible++) {
            int suma = 0; // reiniciar suma para cada prueba

            // Reemplazar '?' por el número posible
            String tarjeta_prueba = numero_tarjeta.replace("?", String.valueOf(posible));

            // Sumar los dígitos de la tarjeta
            for (int i = 0; i < tarjeta_prueba.length(); i++) {
                char c = tarjeta_prueba.charAt(i);
                int cifra = Integer.parseInt(String.valueOf(c));
                suma += cifra;
            }

            // Verificar si la suma es divisible entre 7
            if (suma % 7 == 0) {
                System.out.println("El dígito faltante es: " + posible);
                System.out.println("Número completo: " + tarjeta_prueba);
                break; // salir al encontrar la solución
            }
        }
    }
}
