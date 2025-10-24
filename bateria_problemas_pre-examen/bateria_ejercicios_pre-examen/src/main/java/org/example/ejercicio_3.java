package org.example;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiempofinanciacion=1;
        int resultado=0;
        int pago=0;
        System.out.println("¿A cuanto quieres financiar tu compra?");
        tiempofinanciacion = sc.nextInt();
        System.out.println("introduzca el pago ");
         pago = sc.nextInt();

        for (int i = 1; i<=tiempofinanciacion; i++){
            System.out.println("mes"+i+"="+pago);
            resultado += pago; // resultado cuando vale 0 y pago vale 10, el resultado vale 10
             pago = pago*2;    // la siguiente vuelta el pago vale 20, el resultado sera 10+20=30
            // esta linea duplica el pago para el siguente mes
        }

        System.out.println("total a pagar" +resultado);
    }
}
