package org.example;

import java.util.Scanner;

public class multiplo_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero = sc.nextInt();
        String multiplo;   //condicion ? valor_si_verdadero : valor_si_falso;


        multiplo = (numero%3==0 && numero%5==0) ? "el numero es multiplo de 3 y 5" : numero%3==0 ? "es multiplo de tres" : numero%5==0 ? "es multiplo de 5": "no es multiplo de 5 ni de 3";




        System.out.println(multiplo);

        if (numero%3==0 && numero%5==0){
            System.out.println("el numero es multiplo de 5 y trees");
        } else if (numero%3==0) {
            System.out.println("es multiplo de tres");
        }else {
            System.out.println("es multiplo de cinco");
        }
    }
}
