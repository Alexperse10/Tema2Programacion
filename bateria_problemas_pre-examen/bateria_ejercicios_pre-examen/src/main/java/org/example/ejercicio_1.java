package org.example;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeromenorcero=0;
        int numeromayorcero=0;
        int numeroigual=0;
        System.out.println("cuantos numeros deseas introducir?");
        int totalnumeros = sc.nextInt();
        for (int i = 1; i<=totalnumeros; i++){
            System.out.println("numero "+i+":");
            int numero = sc.nextInt();
            if (numero<0){
                numeromenorcero ++;

            } else if (numero>0) {
                numeromayorcero++;

            }else {
                numeroigual++;
            }

        }
        if (numeromayorcero ==0){
            System.out.println("no hay numeros mayores a cero");
        }else {
            System.out.println("los numeros mayores a cero son " +numeromayorcero);
        }
        if (numeromenorcero == 0){
            System.out.println("no hay numeros menores que cero");
        }else {
            System.out.println("los numeros menores a cero son " +numeromenorcero);
        }if (numeroigual==0){
            System.out.println("no hay numeros iguales a cero");
        }else {
            System.out.println("los numeros iguales a cero son " +numeroigual);
        }


    }
}
