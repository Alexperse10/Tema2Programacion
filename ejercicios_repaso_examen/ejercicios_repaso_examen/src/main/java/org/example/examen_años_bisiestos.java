package org.example;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class examen_años_bisiestos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int contadorbisiesto=0;
        int añoactual =LocalDate.now().getYear();
        System.out.println("introduce un año");
        int año = sc.nextInt();
        if (año < 1900 || año > 2025) {
            System.out.println("Error no se pueden introducir años menores a 1900 ni mayores a 2025");
        } else {
            for (int i = año; año <= añoactual; año++) {
                if ((año%4==0 && año%100!=0) || (año%400==0)){
                    contadorbisiesto ++;
                }
            }
            System.out.println("ha habido "+contadorbisiesto);
        }
    }
}