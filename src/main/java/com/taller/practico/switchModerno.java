package com.taller.practico;
import java.util.Scanner;

public class switchModerno {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa el numero del dia de la semana (1 para Lunes, 7 para Domingo): ");
        int numeroDia = consola.nextInt();

        String dia = switch (numeroDia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia no valido";
        };

        String jornada = switch (numeroDia) {
            case 1, 2, 3, 4, 5 -> "Jornada laboral";
            case 6 -> "Jornada reducida";
            case 7 -> "Descanso";
            default -> "Ingresa un numero del 1 al 7";
        };

        System.out.println("Dia: " + dia);
        System.out.println("Tipo de jornada: " + jornada);
    }
}
