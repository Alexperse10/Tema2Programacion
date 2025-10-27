package org.example;

import java.util.Scanner;

public class reparar_codigo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un codigo postal");
        String codigo_postal = sc.nextLine();
        int longitud_codigo = codigo_postal.length();
        char c = codigo_postal.charAt(0);
        int numero_c = Integer.parseInt(String.valueOf(c));


        if (longitud_codigo != 5){
            System.out.println("la cantidada de numeros es incorrecta");
        }
        int posicion_faltante =-1;
        for (int i=0; i<longitud_codigo; i++){
            if (codigo_postal.charAt(i) =='?'){
                posicion_faltante = i;
                break; // se deja de buscar cuando lo encuentro
            }


            }
        if (posicion_faltante ==-1){
            System.out.println("no hay ningun signo ? en el codigo postal");
            return; // vuelve al punto donde se llamo al metodo, es decir al principio del programa
        }
        for (int posible =0; posible<=9; posible++){
            String codigo_prueba = codigo_postal.substring(0,posicion_faltante)+posible+codigo_postal.substring(posicion_faltante+1);
            // sustituye el ? por el numero posible.
            if (numero_c>=0  && numero_c<=5){
                System.out.println("el digito faltante es"+posible);

                System.out.println("el codigo postal complete es" +codigo_prueba);
                break; // sale del bucle o switch actual

            }
        }
        }

    }

