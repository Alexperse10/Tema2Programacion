package org.example;

import java.util.Scanner;

public class numero_mayor_igual_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero1 = sc.nextInt();
        System.out.println("introduce un segundo numero");
        int numero2 = sc.nextInt();
        System.out.println("introduce un tercer numero");
        int numero3 = sc.nextInt();
        String mayor;

        mayor = numero1>numero2 && numero1>numero3 ? " el numero "+ numero1 +" es el mayor"
                : numero2>numero1 && numero2>numero3 ? " el numero " +numero2+ " es el mayor"
                : "el numero "+numero3+ " es el mayor";

        System.out.println(mayor);

        if (numero1>numero2 && numero1>numero3){
            System.out.println("el numero 1 es el mayor");
        } else if (numero2>numero1 && numero2>numero3) {
            System.out.println("el numero 2 es el mayor");
        }else {
            System.out.println("el numero 3 es el mayor");
        }
    }
}
