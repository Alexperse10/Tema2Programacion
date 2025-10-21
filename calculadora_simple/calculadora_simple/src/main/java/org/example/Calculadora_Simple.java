package org.example;

import java.util.Scanner;

public class Calculadora_Simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir = false;
        do {
            try {
                int operando2 = 0;
                repetir = false;
                System.out.println("*** BIENVENIDO A LA CALCULADORA RAPIDA ***");
                System.out.println("introduce operando: ");
                int operando1 = sc.nextInt();
                double numero = 0;
                System.out.println("---------------------------------------------");
                System.out.println("[+] -> sumar");
                System.out.println("[-] -> restar");
                System.out.println("[x] -> multiplicar");
                System.out.println("[/] -> dividir");
                System.out.println("[R] -> raiz cuadrada");
                System.out.println("---------------------------------------------");

                System.out.println("elige una opción");
                String opcion = sc.next();
                String opcion_mayusculas=opcion.toUpperCase();
                if (!opcion.equalsIgnoreCase("R")) {
                    System.out.println("introduce un segundo operando");
                    operando2 = sc.nextInt();
                }
                switch (opcion_mayusculas) {
                    case "+":
                        int sumar = operando1 + operando2;
                        System.out.println("el resultado de " + operando1 + "+" + operando2 + "=" + sumar);
                        break;
                    case "-":
                        int restar = operando1 - operando2;
                        System.out.println("el resultado de " + operando1 + "-" + operando2 + "=" + restar);
                        break;
                    case "X":
                        int multiplicar = operando1 * operando2;
                        System.out.println("el resultado de " + operando1 + "x" + operando2 + "=" + multiplicar);
                        break;
                    case "/":
                        if (operando2 == 0) {
                            System.out.println("No se puede dividir un numero entre cero");
                        } else {
                            int dividir = operando1 / operando2;
                            System.out.println("el resultado de " + operando1 + "/" + operando2 + "=" + dividir);
                        }
                        break;
                    case "R":
                        if (operando1<0){
                            System.out.println("no se puede realizar la raiz cuadrada de un numero negativo");
                        }else {
                            double raiz = Math.sqrt(operando1);
                            System.out.println("el resultado de la raiz es: " + raiz);
                        }
                        break;
                    default:
                        System.out.println("la opcion no es correcta");

                }

            } catch (Exception err) {
                repetir = true;
                System.out.println("ERROR: valores invalidos");
            }
            sc.nextLine();
        }while (repetir == true);
    }
}



