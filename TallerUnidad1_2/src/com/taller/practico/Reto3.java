package com.taller.practico;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        double precioBase = 100.0;

        System.out.println("Ingresa el tipo de entrada: VIP, Estudiante, General o Adulto_Mayor");
        String tipoEntrada = consola.nextLine().trim().toUpperCase();

        double ajuste;
        String detalle;

        if (tipoEntrada.equals("VIP")) {
            ajuste = precioBase * 0.10;
            detalle = "Recargo del 10% por beneficios exclusivos";
        } else if (tipoEntrada.equals("ESTUDIANTE")) {
            ajuste = -(precioBase * 0.50);
            detalle = "Descuento del 50%";
        } else if (tipoEntrada.equals("ADULTO_MAYOR")) {
            ajuste = -(precioBase * 0.40);
            detalle = "Descuento del 40%";
        } else if (tipoEntrada.equals("GENERAL")) {
            ajuste = 0;
            detalle = "Tarifa base sin modificaciones";
        } else {
            System.out.println("Tipo de entrada no valido: " + tipoEntrada);
            return;
        }

        double precioFinal = precioBase + ajuste;

        System.out.println("----- Desglose de la entrada -----");
        System.out.println("Tipo de entrada: " + tipoEntrada);
        System.out.println("Precio base: " + precioBase);
        System.out.println(detalle + ": " + ajuste);
        System.out.println("Monto final a pagar: " + precioFinal);
    }
}
