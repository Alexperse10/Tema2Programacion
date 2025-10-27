package org.example;

import java.util.Scanner;

public class practica_validacion_isbn_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0; // aquí guardo el total de la acumulación de las multiplicaciones
        int multiplicacion; // multiplico la posición por la cifra

        String numero;
        System.out.println("** VALIDADOR ISBN **");
        System.out.println("1-VALIDAR ISBN");
        System.out.println("2-REPARAR ISBN");
        System.out.println("X-SALIR");
        String opcion = sc.nextLine();

        switch (opcion) {
            case "1":
                System.out.println("Introduce ISBN");
                numero = sc.nextLine();
                numero = numero.trim();
                int numero_longitud = numero.length();
                if (numero_longitud != 10) {
                    System.out.println("El ISBN es inválido");
                    break;
                }
                suma =0;
                for (int i = 0; i < 10; i++) {
                    char c = numero.charAt(i);
                    int cifra;


                    if (c == 'x') {
                        cifra = 10;
                    } else {
                        cifra = Integer.parseInt(String.valueOf(c));
                    }

                    int posicion = 10 - i;
                    multiplicacion = cifra * posicion;
                    suma = suma + multiplicacion;

                    System.out.println(cifra + "*" + posicion + "=" + multiplicacion);
                }

                System.out.println("El resultado de la suma: " + suma);
                if (suma % 11 == 0) {
                    System.out.println("El ISBN es válido");
                } else {
                    System.out.println("El ISBN es inválido");
                }
                break;

            case "2":
                System.out.println("Introduce el ISBN que quieres reparar:");
                String numero_reparar = sc.nextLine();

                int longitud_numero = numero_reparar.length();
                if (longitud_numero != 10) {
                    System.out.println("El número ISBN es inválido");
                    break;
                }

                int posicioninterrogante = numero_reparar.indexOf('?');
                if (posicioninterrogante == -1) {
                    System.out.println("No hay ningún signo '?' en el ISBN");
                    break;
                }

                for (int cifras_posibles = 0; cifras_posibles <= 10; cifras_posibles++) {
                    char caracterreemplazar; // creo una variable para guardar el caracter que reemplaza el símbolo ?

                    if (cifras_posibles == 10) { // si la cifra es 10 el caracter es x
                        caracterreemplazar = 'x';
                    } else {
                        caracterreemplazar = (char) ('0' + cifras_posibles);
                    }

                    // reemplazo el signo de interrogación por el carácter actual
                    String numero_prueba = numero_reparar.replace('?', caracterreemplazar);

                    int suma_prueba = 0;
                    for (int i = 0; i < 10; i++) {
                        char c = numero_prueba.charAt(i);
                        int cifra;
                        if (c == 'x') {
                            cifra = 10;
                        } else {
                            cifra = Integer.parseInt(String.valueOf(c));
                        }
                        int posicion = 10 - i;
                        suma_prueba = suma_prueba + (cifra * posicion);
                    }

                    if (suma_prueba % 11 == 0) {
                        if (cifras_posibles == 10) {
                            System.out.println("El dígito faltante es: x");
                        } else {
                            System.out.println("El dígito faltante es: " + cifras_posibles);
                        }
                        break;
                    }
                }
                break;

            case "x":
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción incorrecta");
        }
    }
}
