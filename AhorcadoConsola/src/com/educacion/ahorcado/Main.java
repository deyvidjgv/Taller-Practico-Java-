package com.educacion.ahorcado;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        final int MAX_INTENTOS = 6;
        final double PUNTAJE_BASE = 100.0;
        final double BONO_POR_INTENTO = 12.5;

        int opcion = 0;
        String entrada = "";

        int partidasJugadas = 0;
        int partidasGanadas = 0;
        int partidasPerdidas = 0;
        double mejorPuntaje = 0.0;

        // Fase 1: menu principal
        do {
            System.out.println();
            System.out.println("======== AHORCADO DE CONSOLA ========");
            System.out.println("1. Jugar");
            System.out.println("2. Ver Estadísticas");
            System.out.println("3. Salir");

            boolean opcionValida = false;
            while (!opcionValida) {
                System.out.print("elija una opción: ");
                entrada = console.nextLine().trim();
                try {
                    opcion = Integer.parseInt(entrada);
                    if (opcion >= 1 && opcion <= 3) {
                        opcionValida = true;
                    } else {
                        System.out.println("Error: la opción " + opcion + " no existe, solo puede elegir 1, 2 o 3");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: \"" + entrada + "\" no es un número, escriba 1, 2 o 3");
                }
            }

            switch (opcion) {
                case 1:
                    // Fase 2: registro del jugador e inicializacion
                    String nombreJugador = "";
                    while (nombreJugador.length() == 0) {
                        System.out.print("ingrese su nombre: ");
                        nombreJugador = console.nextLine().trim().toUpperCase();
                        if (nombreJugador.length() == 0) {
                            System.out.println("Error: el nombre no puede estar vacío");
                        }
                    }

                    int indicePalabra = (int) (Math.random() * 6);
                    String palabraSecreta = switch (indicePalabra) {
                        case 0 -> "JAVA";
                        case 1 -> "STRING";
                        case 2 -> "SCANNER";
                        case 3 -> "VARIABLE";
                        case 4 -> "BUCLE";
                        default -> "CONSTANTE";
                    };

                    int intentosRestantes = MAX_INTENTOS;
                    double puntaje = PUNTAJE_BASE;
                    boolean juegoGanado = false;
                    char ultimaLetra = ' ';
                    int aciertos = 0;
                    int turnos = 0;

                    StringBuilder mascara = new StringBuilder();
                    for (int i = 0; i < palabraSecreta.length(); i++) {
                        if (i > 0) {
                            mascara.append(' ');
                        }
                        mascara.append('_');
                    }
                    StringBuilder historial = new StringBuilder();

                    System.out.println("bienvenido " + nombreJugador + ", la palabra tiene " + palabraSecreta.length() + " letras");

                    // Fase 3: bucle del juego
                    while (intentosRestantes > 0 && !juegoGanado) {
                        System.out.println();
                        System.out.println("palabra: " + mascara);
                        System.out.println("letras usadas: " + historial);
                        System.out.println("intentos restantes: " + intentosRestantes + " / " + MAX_INTENTOS);
                        System.out.print("ingrese una letra (0 para rendirse): ");
                        String letra = console.nextLine().trim().toUpperCase();

                        if (letra.length() == 0) {
                            System.out.println("Error: no escribió ninguna letra");
                            continue;
                        }
                        if (letra.equals("0")) {
                            System.out.println("se rindió, fin de la partida");
                            break;
                        }

                        ultimaLetra = letra.charAt(0);
                        if (letra.length() > 1 || !Character.isLetter(ultimaLetra)) {
                            System.out.println("Error: escriba una sola letra");
                            continue;
                        }
                        if (historial.indexOf(letra) >= 0) {
                            System.out.println("ya había usado la letra " + ultimaLetra + ", intente con otra");
                            continue;
                        }
                        historial.append(ultimaLetra).append(' ');
                        turnos++;

                        boolean acierto = false;
                        for (int i = 0; i < palabraSecreta.length(); i++) {
                            if (String.valueOf(palabraSecreta.charAt(i)).equalsIgnoreCase(letra)) {
                                mascara.setCharAt(i * 2, ultimaLetra);
                                acierto = true;
                            }
                        }

                        if (acierto) {
                            aciertos++;
                        } else {
                            intentosRestantes--;
                        }
                        System.out.println(acierto ? "¡bien! la letra " + ultimaLetra + " está en la palabra" : "la letra " + ultimaLetra + " no está en la palabra");

                        if (mascara.indexOf("_") == -1) {
                            juegoGanado = true;
                            break;
                        }
                        if (intentosRestantes == 0) {
                            break;
                        }
                    }

                    // Fase 4: resumen de la partida
                    double porcentajeAciertos = turnos > 0 ? (double) aciertos / turnos * 100 : 0.0;
                    puntaje = juegoGanado ? puntaje + intentosRestantes * BONO_POR_INTENTO : 0.0;

                    System.out.printf("%n====================================================%n");
                    System.out.printf("%32s%n", "RESUMEN DE LA PARTIDA");
                    System.out.printf("====================================================%n");
                    System.out.printf(" %-21s%s%n", "Jugador:", nombreJugador);
                    System.out.printf(" %-21s%s%n", "Estado Final:", juegoGanado ? "¡VICTORIA!" : "DERROTA");
                    System.out.printf(" %-21s%s%n", "Palabra Secreta:", palabraSecreta);
                    System.out.printf(" %-21s%d / %d%n", "Intentos Restantes:", intentosRestantes, MAX_INTENTOS);
                    System.out.printf(Locale.US, " %-21s%.2f%%%n", "Porcentaje Aciertos:", porcentajeAciertos);
                    System.out.printf(Locale.US, " %-21s%.2f pts%n", "Puntaje Final:", puntaje);
                    System.out.printf("====================================================%n");

                    partidasJugadas++;
                    if (juegoGanado) {
                        partidasGanadas++;
                    } else {
                        partidasPerdidas++;
                    }
                    if (puntaje > mejorPuntaje) {
                        mejorPuntaje = puntaje;
                    }
                    break;
                case 2:
                    if (partidasJugadas == 0) {
                        System.out.println("todavía no hay partidas jugadas");
                        break;
                    }
                    System.out.printf("%n-------- estadísticas de la sesión --------%n");
                    System.out.printf(" %-20s%d%n", "Partidas jugadas:", partidasJugadas);
                    System.out.printf(" %-20s%d%n", "Partidas ganadas:", partidasGanadas);
                    System.out.printf(" %-20s%d%n", "Partidas perdidas:", partidasPerdidas);
                    System.out.printf(Locale.US, " %-20s%.2f pts%n", "Mejor puntaje:", mejorPuntaje);
                    break;
                case 3:
                    System.out.println("saliendo del juego...");
                    break;
            }

        } while (opcion != 3);
    }
}
