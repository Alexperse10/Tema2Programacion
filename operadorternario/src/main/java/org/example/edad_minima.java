package org.example;

import java.util.Scanner;

public class edad_minima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu edad");
        int edad = sc.nextInt();
        String mayormenor;

        mayormenor = edad>=18 ? "eres mayor de edad" : "eres menor de edad";

        System.out.println(mayormenor);
    }
}
