package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_examen_piedra_papel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        int puntosJugador = 0;
        int puntosOrdenador = 0;

        System.out.println("Juego: Piedra, Papel o Tijera (mejor de 3 rondas)");

        for (int ronda = 1; ronda <= 3; ronda++) {
            System.out.println("Ronda " + ronda);
            System.out.print("Elige (p = piedra, a = papel, t = tijera): ");
            String opcionJugador = sc.nextLine().toLowerCase();

            // Comprobamos que el usuario escribe algo válido
            while (!opcionJugador.equals("p") && !opcionJugador.equals("a") && !opcionJugador.equals("t")) {
                System.out.print("Opción no válida. Escribe p, a o t: ");
                opcionJugador = sc.nextLine().toLowerCase();
            }

            // Elección del ordenador (1=p, 2=a, 3=t)
            int numAleatorio = aleatorio.nextInt(3) + 1;
            String opcionPC = "";
            if (numAleatorio == 1) {
                opcionPC = "p";
            } else if (numAleatorio == 2) {
                opcionPC = "a";
            } else {
                opcionPC = "t";
            }

            // Mostramos qué eligió el ordenador
            if (opcionPC.equals("p")) {
                System.out.println("El ordenador ha elegido: Piedra");
            } else if (opcionPC.equals("a")) {
                System.out.println("El ordenador ha elegido: Papel");
            } else {
                System.out.println("El ordenador ha elegido: Tijera");
            }

            // Comprobamos quién gana
            if (opcionJugador.equals(opcionPC)) {
                System.out.println("Empate, se repite la ronda.");
                ronda--; // se repite la misma ronda
                continue;
            }

            if ((opcionJugador.equals("p") && opcionPC.equals("t")) ||
                    (opcionJugador.equals("a") && opcionPC.equals("p")) ||
                    (opcionJugador.equals("t") && opcionPC.equals("a"))) {
                System.out.println("¡Has ganado la ronda!");
                puntosJugador++;
            } else {
                System.out.println("Has perdido la ronda.");
                puntosOrdenador++;
            }

            System.out.println("Marcador (PC - Jugador): " + puntosOrdenador + " - " + puntosJugador);

            // Si alguien llega a 2 victorias, se termina antes
            if (puntosJugador == 2 || puntosOrdenador == 2) {
                break;
            }
        }

        System.out.println("\n--- RESULTADO FINAL ---");
        if (puntosJugador > puntosOrdenador) {
            System.out.println("🎉 ¡HAS GANADO LA PARTIDA!");
        } else {
            System.out.println("💻 El ordenador ha ganado la partida.");
        }
    }
}
