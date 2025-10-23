package org.example;

import java.util.Scanner;

public class modeloA_ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año = 0;
        boolean repetir = false;
        int añoactual = 2025;
        do {
            try {
                System.out.println("introduce un año");
                año = sc.nextInt();
                repetir = false;
            } catch (Exception err) {
                System.out.println("ERROR introduzca un valor valido");
                repetir = true;
            }
            sc.nextLine();
            int contador = 0;
            int total = 0;

            if (año > añoactual || año < 1900) {
                System.out.println("no se aceptan valores");
            } else {
                for (int i = año; i <= añoactual; i++) {                                 // el parentesis Evalúa primero si no es divisible entre 100 o sí lo es entre 400,y luego combina eso con la condición de ser divisible por 4.
                    if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                        contador++;                                                 // contador = contador +1 ;

                    }

                }
                System.out.println("han habito " + contador + " años bisiestos");
            }
        } while (repetir == true || año > añoactual || año < 1900);
    }
}
