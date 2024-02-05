package org.example;

import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};

        while (true) {
            System.out.println("Elige: piedra, papel o tijera (o 'salir' para terminar): ");
            String eleccionJugador = scanner.nextLine().toLowerCase();

            if (eleccionJugador.equals("salir")) {
                System.out.println("¡Hasta luego!");
                break;
            }

            if (!eleccionJugador.equals("piedra") && !eleccionJugador.equals("papel") && !eleccionJugador.equals("tijera")) {
                System.out.println("Elección no válida. Por favor, elige piedra, papel o tijera.");
                continue;
            }

            int indiceComputadora = random.nextInt(3);
            String eleccionComputadora = opciones[indiceComputadora];

            System.out.println("La computadora eligió: " + eleccionComputadora);

            if (eleccionJugador.equals(eleccionComputadora)) {
                System.out.println("¡Empate!");
            } else if ((eleccionJugador.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                    (eleccionJugador.equals("papel") && eleccionComputadora.equals("piedra")) ||
                    (eleccionJugador.equals("tijera") && eleccionComputadora.equals("papel"))) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("¡Perdiste!");
            }
        }

        scanner.close();
    }
}