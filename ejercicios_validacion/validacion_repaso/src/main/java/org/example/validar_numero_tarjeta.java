package org.example;

import java.util.Scanner;

public class validar_numero_tarjeta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0;
        System.out.println("introducir los numeros de la tarjeta");
        String tarjeta = sc.nextLine();

        int longitud_tarjeta = tarjeta.length();
        if (longitud_tarjeta != 4){
            System.out.println("no tiene cuatro digitos");
            return;
        }
        for (int i =0; i<longitud_tarjeta; i++){
            char c = tarjeta.charAt(i);
            int cifra = Integer.parseInt(String.valueOf(c));
            suma = suma +cifra;
        }
        System.out.println(suma);
        if (suma%7==0){
            System.out.println("el numero es valido");
        }else{
            System.out.println("el numero es invalido");
        }
    }

}
