package org.example;

import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma_altura=0;
        int contadoredad=0;
        int contadoraltura=0;
        int contadoredadmayores18=0;
        System.out.println("cuantos alumnos hay");
        int cantidad_alumnos = sc.nextInt();
        for (int i =1; i<=cantidad_alumnos; i++){
            System.out.println("introducir altura alumno" +i);
            double altura = sc.nextDouble();
            System.out.println("introduce la edad"+i);
            int edad = sc.nextInt();
             suma_altura = suma_altura+altura;
             contadoredad = contadoredad+edad;
            if (edad>18) {

                contadoredadmayores18++;
            }
            if (altura>1.75){
                contadoraltura++;
            }

        }
        double promedio_altura = suma_altura/cantidad_alumnos;
        double edadmedia = (double)contadoredad/cantidad_alumnos;

        System.out.println("los alumnos mayores que 18 son: "+contadoredadmayores18);
        System.out.println("los alumnos mayores que 1,75: " +contadoraltura);
        System.out.println("la media de edad es:"+edadmedia);
        System.out.print("la altura media es: "+promedio_altura);
    }
}
