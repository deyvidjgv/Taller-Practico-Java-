package com.taller.practico;
import java.util.Scanner;

public class ternario {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("la cookie de sesion esta activa?, si es verdadero escribe 1 - si es falso escribe 2 : ");
        boolean cookieSesionActiva = consola.nextInt() == 1;

        String estadoConexion = cookieSesionActiva ? "ACTIVA" : "INACTIVA";

        System.out.println("Estado de conexion: " + estadoConexion);
    }
}
