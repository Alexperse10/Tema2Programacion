package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_examen_adivinar_numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int numerointendo=0;
        int numeroaleatorio = aleatorio.nextInt(10) + 1;
        System.out.println("Acobo de pensar un numero [0-10] ¿Puedes adivinarlo? !Tienes 10 intentos!");


            for (int i = 1; i <= 10; i++) {

                System.out.println("intendo numero" + i);
                numerointendo = sc.nextInt();
                if (numeroaleatorio == numerointendo) {
                    System.out.println("has acertado el numero");

                     break;
                } else if (numeroaleatorio > numerointendo) {
                    System.out.println("el numero debe ser mayor");

                } else {
                    System.out.println("el numero debe ser menor");


                }


            }
        System.out.println("lo siento no has acertado el numero");



    }
}
