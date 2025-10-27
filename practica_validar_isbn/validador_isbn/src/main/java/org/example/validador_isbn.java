package org.example;

import java.util.Scanner;

public class validador_isbn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0; // aqui guardo el total de la acumulacion de las multiplicaciones
        int multiplicacion; // multiplico la posicion por la cifra;

        String numero;
        System.out.println("** VALIDADOR ISBN **"); //imprimo menu con las opciones
        System.out.println("1-VALIDAR ISBN");
        System.out.println("2-REPARAR ISBN ");
        System.out.println("X-SALIR");
        String opcion = sc.nextLine();



        switch (opcion) {  // se eligen los bloques con el switch
            case "1":
                System.out.println("introduce isbn"); // se introduce el numero isbn por teclado
                numero = sc.nextLine();
                int numero_longitud = numero.length(); // cuenta cantidad de caracteres que tiene el numero
                if (numero_longitud != 10) { // si numero no tiene 10 caracteres es invalido
                    System.out.println("el isbn es invalido");
                    break; // sale del bucle
                }
                for (int i = 0; i < 10; i++) { // se realiza un for para recorrer los numeros del 0 al 9
                    char c = numero.charAt(i); // obtengo el caracter en la posicion i
                    int cifra; // guardo el valor de ese caracter

                    if (c == 'x') { // si se introduce el valor x sera un 10
                        cifra = 10;
                    }else { // sino se introduce un valor x la cifra cogera el valor de c
                        cifra = Integer.parseInt(String.valueOf(c));
                        // aqui convierto ese caracter a un string y despues tengo que trnaformar ese string a un numero para poder multiplicarlo
                    }

                    int posicion = 10 - i; // Se calcula la posicion empezando de mayor a menor
                    multiplicacion = cifra * posicion; // multipico cifra por posicion
                    suma = suma + multiplicacion; // se guarda el resultado en la variable suma que va incrementando
                    System.out.println(cifra + "*" + posicion + "=" + multiplicacion); // va mostrando la multiplicacion


                }
                System.out.println("el resultado de la suma: " + suma); // muestra la suma total
                if (suma % 11 ==0){  // si la suma total es divisible entre 11 es valido, se mustra el mensaje
                    System.out.println("el isbn es valido");
                }else {
                    System.out.println("el isbn es invalido"); // si no es divisible entre 11 es invalido
                }
                break;

            case "2":
                System.out.println("Introduce el isbn que quieres reparar:"); // aqui introduzco el isbn que quiero reparar
                String numero_reparar = sc.nextLine();
                int longitud_numero = numero_reparar.length(); // se calcula la cantidad de caracteres que tiene el numero.
                if (longitud_numero != 10) {  // Si el numero tiene un longitud diferente a 10 caracteres es invalido
                    System.out.println("El numero ISBN es invalido");
                    break;
                }
                int posicioninterrogante = -1; // lo guardo como -1 para indicar que no se ha encotnrado la posicion ?
                for (int i = 0; i < 10; i++) { // se busca la posicion del ? y la guardo en la posicion interrogante.

                    if (numero_reparar.charAt(i) == '?') {
                        posicioninterrogante = i; // en el momento que se encuentra un interrogante se actualiza a la posicion donde la ha encotnrado.
                        break;
                    }
                }

                if (posicioninterrogante == -1) { // si no se encuentra el caracter ? salta el mensaje de aviso
                    System.out.println("No hay ningún signo '?' en el ISBN");
                    break;
                }


                for (int cifras_posibles = 0; cifras_posibles <= 10; cifras_posibles++) { // tengo que probar posibles cifras que pueda tener la cifra faltante
                    // desde 0 a 10
                    int suma_prueba = 0; // varaible donde realiza la suma de cada prueba

                    for (int i = 0; i < 10; i++) { // aqui vuelve a recorrer todos los numeros
                        char c = numero_reparar.charAt(i);
                        int cifra;
                        if (i == posicioninterrogante) { // si estoy en la posicion de ? se usa el valor cifras_posibles
                            cifra = cifras_posibles;
                        } else if (c == 'x') { // si es x es igual a 10
                            cifra = 10;
                        } else {
                            cifra = Integer.parseInt(String.valueOf(c));  // el caracter se debe de pasar a string y una vez esto se pasa a int
                        }
                        int posicion = 10 - i;  // se calcula posicion empezando de mayor a menor
                        suma_prueba = suma_prueba + (cifra * posicion); // se realiza la suma y multiplicacion
                    }

                    if (suma_prueba % 11 == 0) { // se verifica que sea divisible entre 11
                        if (cifras_posibles == 10) {
                            System.out.println("El digito faltante es: X");  // si la cifra_posible es 10 el caracter faltante es una x
                        } else {
                            System.out.println("El digito faltante es: " + cifras_posibles);
                        }
                        break;
                    }
                }
                break;

            case "x":
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción incorrecta");
        }
    }
}