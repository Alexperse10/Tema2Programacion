package org.example;

import java.util.Scanner;

public class validar_codigopostal {
    //Descripción:
    //Un código postal en España tiene 5 dígitos. El primer dígito indica la provincia (0–5), y el resto pueden ser cualquier número.
    //Debes escribir un programa que:
    //
    //Pida al usuario un código postal.
    //
    //Compruebe que tiene exactamente 5 dígitos.
    //
    //Compruebe que el primer dígito esté entre 0 y 5.
    //
    //Imprima si el código es válido o inválido.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el codigo postal");
        String codigo_postal = sc.nextLine();

        int longitud_codigo = codigo_postal.length();
        char c = codigo_postal.charAt(0); // aqui lo que hago es coger una cifra
        int numero_c = Integer.parseInt(String.valueOf(c)); // la convierto de char en string y de string a integer
        if (numero_c>5 || numero_c<0){
            System.out.println("los valores estan fuera de rango");

        } else if (longitud_codigo >5) {
            System.out.println("tienen mas de 5 cifras");
        }else {
            System.out.println("el codigo es correcto");
        }

    }
}
