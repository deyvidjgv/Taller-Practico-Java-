package com.taller.practico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");

        int edadUsuario = consola.nextInt();

        String categoria;
        String perfilAcceso;

        if (edadUsuario < 12) {
            categoria = "Infante";
            perfilAcceso = "restringido - Infantil";
        } else if (edadUsuario <= 17) {
            categoria = "Adolescente";
            perfilAcceso = "Moderado - Juvenil";
        } else if (edadUsuario <= 64) {
            categoria = "Adulto";
            perfilAcceso = "Total - adulto";
        } else {
            categoria = "Adulto Mayor";
            perfilAcceso = "Total - Senior";
        }
        System.out.println("Edad ingresada: " + edadUsuario);
        System.out.println("Categoría asignada: " + categoria);
        System.out.println("Perfil de acceso activado: " + perfilAcceso);
    }
}
