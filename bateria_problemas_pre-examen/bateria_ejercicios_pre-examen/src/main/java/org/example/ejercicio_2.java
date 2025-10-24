package org.example;

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numeroreal;
        int numeropotencia;
        double multiplicacion=1;
        System.out.println("introduce un numero real ");
        numeroreal = sc.nextDouble();
        System.out.println("introducir numero potencia");
        numeropotencia = sc.nextInt();

        for (int i =0 ; i<numeropotencia ; i++){
            multiplicacion *=numeroreal;   //multiplicacion = multiplicacion*numeroeal;
            // multiplicacion va guardando el resultado parcial de la potencia en cada vuelta del bucle.

        }
        System.out.println("la potencia es: "+multiplicacion);
    }
}
