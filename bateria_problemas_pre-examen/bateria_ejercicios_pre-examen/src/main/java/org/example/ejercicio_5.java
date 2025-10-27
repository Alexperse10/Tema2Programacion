package org.example;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldomaximo=0;
        int contadorsueldos=0;
        for (int i = 1; i<=5; i++){
            System.out.println("introduce el sueldo "+i);
            int sueldo = sc.nextInt();
            if (sueldo>sueldomaximo){
                sueldomaximo = sueldo;
            }
            if (sueldo>1000){
                contadorsueldos++;
            }

        }
        System.out.println(sueldomaximo);
        System.out.println(contadorsueldos);
    }
}
