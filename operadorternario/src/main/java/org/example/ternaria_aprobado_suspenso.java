package org.example;

import java.util.Scanner;

public class ternaria_aprobado_suspenso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int nota = sc.nextInt();
        String passdefault;

        passdefault = nota<5 ? "estas suspendido" : "estas aprobado";

        System.out.println(passdefault);
    }
}
