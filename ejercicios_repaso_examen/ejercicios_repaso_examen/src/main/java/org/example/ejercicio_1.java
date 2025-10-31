package org.example;

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeromax=0;
        int contadormayor=0;
        int contadormenor=0;
        int contadorigual=0;
        System.out.println("cuantos numeros deseas introducir");
        int cantidaddenumeros = sc.nextInt();

        for (int i = 1; i<=cantidaddenumeros; i++){
            System.out.println("introduce el numero "+i+":");
            int numero = sc.nextInt();
            if (numero>numeromax){
                numeromax=numero;

            }
            if (numero>0){
                contadormayor++;
            } else if (numero<0) {
                contadormenor++;
            }else {
                contadorigual++;
            }

        }
        System.out.println("numero maximo es "+numeromax);
        System.out.println("los numeros mayores de 0 son: "+contadormayor);
        System.out.println("los numeros menores de 0 son: "+contadormenor);
        System.out.println("los numeros iguales a 0 son: "+contadorigual);

    }
}
