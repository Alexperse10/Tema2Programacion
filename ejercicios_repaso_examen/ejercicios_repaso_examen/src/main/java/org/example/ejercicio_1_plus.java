package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_1_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int contadormax=0;
        int contadormin=0;
        int contadorigual=0;
        System.out.println("introduce por teclado una cantidad de numeros");
        int numero = sc.nextInt();

        for (int i =1; i<numero; i++){
            int numerorandom = aleatorio.nextInt();
            System.out.println("el numero aleatorio "+i+" es "+numerorandom);
            if (numerorandom>0){
                contadormax++;
            } else if (numerorandom<0) {
                contadormin++;
            }else {
                contadorigual++;
            }
        }
        System.out.println("la cantidad de numeros mayores de 0 "+contadormax);
        System.out.println("la cantidad de numeros menores de 0 "+contadormin);
        System.out.println("la cantidad de numero iguales de 0 "+contadorigual);
    }
}
