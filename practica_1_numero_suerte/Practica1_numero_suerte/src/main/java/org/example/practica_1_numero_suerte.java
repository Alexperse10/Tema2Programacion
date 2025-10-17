package org.example;

import java.util.Scanner;

public class practica_1_numero_suerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu fecha de nacimiento: (dd/mm/aaaa)");
        String fechanacimiento = sc.nextLine();

        int longitud_fecha = fechanacimiento.length(); // muestro la cantidad de caracteres que tiene la fecha
        System.out.println("la fecha tiene una longitud de "+longitud_fecha +" caracteres");

        int primerabarra = fechanacimiento.indexOf("/"); // busco las barras en la fecha
        System.out.println("primera barra se encuentra en la posicion "+primerabarra);

        int segundabarra = fechanacimiento.lastIndexOf("/"); //busco la ultimo barra;
        System.out.println("segunda barra esta en la posicion " +segundabarra);
// Aqui cojo solo el dia, la fecha y el año en formato String despues tengo que cambiarlo a int para poder sumar
        String dia = fechanacimiento.substring(0,primerabarra);
        String mes = fechanacimiento.substring(primerabarra+1,segundabarra); // hay que sumarle uno ya que si no se lo sumas te coge la barra y eso no lo quiero
        String año = fechanacimiento.substring(segundabarra+1);
// paso el string a int para poderlo sumar
        int dia_numerico = Integer.parseInt(dia);
        int mes_numerico = Integer.parseInt(mes);
        int año_numerico = Integer.parseInt(año);

        int sumarpartes = dia_numerico + mes_numerico + año_numerico;
        System.out.println(dia_numerico+ "+" +mes_numerico+ "+" +año_numerico+ "=" +sumarpartes);

        String sumarpartes_string = Integer.toString(sumarpartes);
        String primernumero = sumarpartes_string.substring(0,1);
        String segundonumero = sumarpartes_string.substring(1,2);
        String tercernumero = sumarpartes_string.substring(2,3);
        String cuartonumero = sumarpartes_string.substring(3,4);

        int primernumerico = Integer.parseInt(primernumero);
        int segundonnumerico = Integer.parseInt(segundonumero);
        int tercernumerico = Integer.parseInt(tercernumero);
        int cuartonumerico = Integer.parseInt(cuartonumero);
        int totalsuma = primernumerico + segundonnumerico +tercernumerico+ cuartonumerico;

        System.out.println(+primernumerico+ "+" +segundonnumerico+ "+" +tercernumerico+ "+" +cuartonumerico+ "=" +totalsuma);
    }
}
