package org.example;

import java.util.Scanner;

public class Tema2_Numero_Suerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fechavalida = false;
        int dia_numerico = 0;
        int mes_numerico = 0;
        int año_numerico = 0;

        do {


            System.out.println("introduce tu fecha de nacimiento: (dd/mm/aaaa)");
            String fechanacimiento = sc.nextLine();

            int longitud_fecha = fechanacimiento.length(); // muestro la cantidad de caracteres que tiene la fecha


            int primerabarra = fechanacimiento.indexOf("/"); // busco las barras en la fecha


            int segundabarra = fechanacimiento.lastIndexOf("/"); //busco la ultimo barra;
// en este if controlo que se introduzcan las barras en la posicion correcta, como yo se que la primera barra
// esta en la posicion 2 que lo he calculado con indexof, y la segunda con el lastIndexof en la posicion 5, digo
// que si la primera barra es = 20 el formato es incorrecto, deberia ser dos y por ultimo la igualdad de ambas barras que no pueden
// estar en la misma posicion, asi pues con este if puedo controlar que el formato de fecha sea el correcto.
            if (primerabarra == 20 || segundabarra == 20 || primerabarra == segundabarra) {
                System.out.println("formato incorrecto, debe ser (dd/mm/aaaa)");

            }else {

// Aqui cojo solo el dia, la fecha y el año en formato String despues tengo que cambiarlo a int para poder sumar
                String dia = fechanacimiento.substring(0, primerabarra);
                String mes = fechanacimiento.substring(primerabarra + 1, segundabarra); // hay que sumarle uno ya que si no se lo sumas te coge la barra y eso no lo quiero
                String año = fechanacimiento.substring(segundabarra + 1);



// paso el string a int para poderlo sumar
                dia_numerico = Integer.parseInt(dia);
                mes_numerico = Integer.parseInt(mes);
                año_numerico = Integer.parseInt(año);

                if (dia_numerico < 1 || dia_numerico>31 || mes_numerico < 1 || mes_numerico>12 || año_numerico < 1) {
                    System.out.println("No se pueden introducir numeros negativos ni ceros como unico valor, ni valores fuera de fecha");

                } else {
                    fechavalida = true;
                    int sumarpartes = dia_numerico + mes_numerico + año_numerico;
                    System.out.println(dia_numerico + "+" + mes_numerico + "+" + año_numerico + "=" + sumarpartes);


                    String sumarpartes_string = Integer.toString(sumarpartes);
                    String primernumero = sumarpartes_string.substring(0, 1);
                    String segundonumero = sumarpartes_string.substring(1, 2);
                    String tercernumero = sumarpartes_string.substring(2, 3);
                    String cuartonumero = sumarpartes_string.substring(3, 4);

                    int primernumerico = Integer.parseInt(primernumero);
                    int segundonnumerico = Integer.parseInt(segundonumero);
                    int tercernumerico = Integer.parseInt(tercernumero);
                    int cuartonumerico = Integer.parseInt(cuartonumero);
                    int totalsuma = primernumerico + segundonnumerico + tercernumerico + cuartonumerico;

                    System.out.println(+primernumerico + "+" + segundonnumerico + "+" + tercernumerico + "+" + cuartonumerico + "=" + totalsuma);


                }

            }

        }
        while (dia_numerico < 1 || dia_numerico>31 || mes_numerico < 1 || mes_numerico>12 || año_numerico < 1) ;

    }

}