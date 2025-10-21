package org.example;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sintaxis es boolean resultado = texto.contains("subcadena")
        int contador=1;
        final int totaloportunidades=4;
        boolean acertado = false;
           System.out.println("introduce una frase");
           String frase = sc.nextLine();
        do {
           System.out.println("introduce una palabra");
           String palabra = sc.nextLine();
           boolean contiene = frase.contains(palabra);
           if (contiene){
               System.out.println("enhorabuena has acertado");
               acertado =true;
           }else {
               int oportunidades = totaloportunidades- contador;
               System.out.println("lo siento no has acertado, te quedan "+oportunidades);
               if (oportunidades ==0){
                   System.out.println("lo siento no te queda ninguna oportunidad");
               }
               contador ++;
           }
       }while (!acertado && contador<=totaloportunidades);

    }
}
