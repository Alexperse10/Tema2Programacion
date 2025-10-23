package org.example;

import java.util.Scanner;

public class Calculadora_descuento_descuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el precio original del producto");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("el tipo de cliente");
        String tipo_cliente = sc.nextLine();

        String tipo_cliente_mayusculas = tipo_cliente.toUpperCase();

        switch (tipo_cliente_mayusculas) {
            case "NORMAL":
                System.out.println("el usuario debe pagar: "+precio);
                break;
            case "FRECUENTE":
                Double precio_10 = precio -(0.10 * precio) ;
                System.out.println("el precio del cliente frecuente es: "+precio_10);
                break;
            case "VIP":
                Double precio_20 = precio -(0.20 * precio);
                System.out.println("el precio del cliente vip es: "+precio_20);
                break;
            default:
                System.out.println("el tipo del cliente no es valido");
        }
    }
}
