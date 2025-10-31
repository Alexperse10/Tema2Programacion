package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int resultado=1;

        System.out.println("introduce un numero real ");
        double numeroreal = sc.nextInt();
        System.out.println("introduce un numero potencia");
        int numeropotencia = sc.nextInt();
        if (numeropotencia < 0) {
            System.out.println("el numero no puede ser negativo");
        } else {

            for (int i = 0; i <numeropotencia; i++){
                resultado *=numeroreal;
            }
            System.out.print(resultado);
        }
    }
}