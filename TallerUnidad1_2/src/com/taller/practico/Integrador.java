package com.taller.practico;
import java.util.Scanner;

public class Integrador {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        double precioUnitario = 250.00;

        System.out.println("Ingresa la cantidad de licencias: ");
        int cantidad = consola.nextInt();
        consola.nextLine();

        System.out.println("Ingresa el tipo de cliente: VIP, Regular o Nuevo");
        String tipoCliente = consola.nextLine().trim().toUpperCase();

        System.out.println("Ingresa el cupon (si no tienes escribe no): ");
        String cupon = consola.nextLine().trim();

        double subtotalBase = cantidad * precioUnitario;

        double porcentajeDescuento = switch (tipoCliente) {
            case "VIP" -> 0.20;
            case "REGULAR" -> 0.10;
            case "NUEVO" -> 0.05;
            default -> 0.0;
        };

        double descuentoCliente = subtotalBase * porcentajeDescuento;
        double subtotalConDescuento = subtotalBase - descuentoCliente;

        double descuentoCupon;

        if ((cupon.equals("PROMO1") || cupon.equals("PROMO1 año")) && subtotalConDescuento >= 500.00) {
            descuentoCupon = 50.00;
        } else {
            descuentoCupon = 0.00;
        }

        double baseImponible = subtotalConDescuento - descuentoCupon;
        double iva = baseImponible * 0.16;
        double totalFinal = baseImponible + iva;

        System.out.println("----- Factura -----");
        System.out.println("Subtotal base: $" + subtotalBase);
        System.out.println("Descuento cliente: -$" + descuentoCliente);
        System.out.println("Descuento cupon: -$" + descuentoCupon);
        System.out.println("Base imponible: $" + baseImponible);
        System.out.println("IVA (16%): +$" + iva);
        System.out.println("Total a pagar = $" + totalFinal);
    }
}
