package org.example;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("cuanto tiempo de financiacion");
        int mesfinancion = sc.nextInt();
        int comienzomes=10;
        int suma=0;
        for (int i = 1; i<=mesfinancion; i++){
            System.out.println("mes "+i+"="+comienzomes);
            suma = suma +comienzomes;
            comienzomes *=2;

        }
        System.out.println("el importe a pagar es "+suma);
    }
}
