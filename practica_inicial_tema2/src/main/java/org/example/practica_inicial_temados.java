package org.example;

import java.util.Scanner;

public class practica_inicial_temados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplicando;
        int multiplicador;
        int resultado;
        do {
            System.out.print("introduce el multiplicando (3 cifras): ");
            multiplicando = sc.nextInt();
            System.out.print("introduce el multiplicador (3 cifras): ");
            multiplicador = sc.nextInt();
            if ((multiplicador>-100 && multiplicador<100) || (multiplicando>-100 && multiplicando<100) || multiplicador>999 || multiplicador<-999 || multiplicando>999 || multiplicando<-999){
                System.out.println("ERROR: introduce un numero valido");
            }

        }while ((multiplicador>-100 && multiplicador<100) || (multiplicando>-100 && multiplicando<100) || multiplicador>999 || multiplicador<-999 || multiplicando>999 || multiplicando<-999);
        resultado = multiplicando * multiplicador;

        System.out.println("el producto de la multiplicacion es: "+ resultado);

        System.out.println("el proceso es: ");

        System.out.println("                     "+multiplicando);
        System.out.println("x                    "+multiplicador);

        System.out.println("-------------------------------");



        // Aqui tengo el bloque del multiplicador
        String numero1 = Integer.toString(multiplicador);  // el numero hay que pasarlo a String
        String numero1_1 =numero1.substring(0,1); // despues se coge cada cifra del numero en String
        String numero1_2=numero1.substring(1,2);
        String numero1_3=numero1.substring(2,3);
        int num_1 = Integer.parseInt(numero1_1); // el numero se convierte de string a int
        int num_2 = Integer.parseInt(numero1_2);
        int num_3 = Integer.parseInt(numero1_3);
        //multiplico el ultimo numero del multiplicador por el numero del multiplicando
        int resultado1 = num_3 * multiplicando;

        // multiplicando el penultimo numero por el numero del multiplicando
        int resultado2_1 = num_2 * multiplicando;

        // multiplicando el primer numero por el multiplicando
        int resultado3_1 = num_1 * multiplicando;


        // multiplico el penultimo numero del multiplciador por el numero del multiplicando


        System.out.println("                    "+resultado1);
        System.out.println("                   "+resultado2_1+"x");
        System.out.println("                  "+resultado3_1+"xx");

        System.out.println("-------------------------------------------------------------------");

        System.out.println("                  "+resultado);

    }
}

//// Aqui tengo el bloque del multiplicando
//        String numero2 = Integer.toString(multiplicando);
//        String numero2_1 = numero2.substring(0,1);
//        String numero2_2 = numero2.substring(1,2);
//        String numero2_3 = numero2.substring(2,3);
//        int num2_1 = Integer.parseInt(numero2_1);
//        int num2_2 = Integer.parseInt(numero2_2);
//        int num2_3 = Integer.parseInt(numero2_3);