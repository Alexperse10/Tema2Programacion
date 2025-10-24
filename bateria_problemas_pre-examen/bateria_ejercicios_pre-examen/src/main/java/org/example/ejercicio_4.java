package org.example;

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = false;
        do {


            System.out.println("Introduce la nota del alumno");
            int nota = sc.nextInt();

            switch (nota) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("insuficiente");
                    break;
                case 5:
                    System.out.println("suficiente");
                    break;
                case 6:
                    System.out.println("bien");
                    break;
                case 7:
                case 8:
                    System.out.println("notable");
                    break;
                case 9:
                case 10:
                    System.out.println("sobresaliente");
                    break;

                default:
                    System.out.println("ERROR valor incorrecto ");
                    repetir = true;
            }

        }while (repetir);
    }
}