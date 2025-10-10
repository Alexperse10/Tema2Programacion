package org.example;

import java.util.Scanner;
//Descuento en tienda
//Pide el precio de un producto y aplica:
//
//10% de descuento si cuesta más de 100€,
//
//5% si cuesta entre 50 y 100€,
//
//0% si cuesta menos de 50€.
//(Usa ternarios anidados y cálculos matemáticos.)
public class descuento_tienda_ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precio;
        String descuento;
        double diezporciento;
        System.out.println("introduce el precio");
        precio = sc.nextInt();
        diezporciento = precio*0.10-precio;


    }
}
