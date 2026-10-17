package com.taller.practico;
import java.util.Scanner;

public class SwitchTradicional {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa el numero del dia de la semana (1 para Lunes, 7 para Domingo): ");
        int numeroDia = consola.nextInt();

        String dia;
        String jornada;

        switch (numeroDia) {
            case 1:
                dia = "Lunes";
                jornada = "Jornada laboral";
                break;
            case 2:
                dia = "Martes";
                jornada = "Jornada laboral";
                break;
            case 3:
                dia = "Miercoles";
                jornada = "Jornada laboral";
                break;
            case 4:
                dia = "Jueves";
                jornada = "Jornada laboral";
                break;
            case 5:
                dia = "Viernes";
                jornada = "Jornada laboral";
                break;
            case 6:
                dia = "Sabado";
                jornada = "Jornada reducida";
                break;
            case 7:
                dia = "Domingo";
                jornada = "Descanso";
                break;
            default:
                dia = "Dia no valido";
                jornada = "Ingresa un numero del 1 al 7";
                break;
        }

        System.out.println("Dia: " + dia);
        System.out.println("Tipo de jornada: " + jornada);
    }
}
