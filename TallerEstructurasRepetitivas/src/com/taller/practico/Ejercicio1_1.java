package com.taller.practico;

import java.util.Scanner;


public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner Numero = new Scanner(System.in);


        int ValorCentinela = -99;
        int Acumulador = 0;
        int Contador = 0;
        int suma = 0;



        while (suma != ValorCentinela){
            System.out.println(" -------- Iniciando contador --------");
            System.out.print("Digite el numero: ");
            suma = Numero.nextInt();

            if (suma == ValorCentinela) {
                break;
            }

            Acumulador += suma;
            System.out.println("Total de los numero sumados: " + Acumulador);

            Contador++;
            System.out.println("Contador de numero digitados: " + Contador);
        }

        System.out.println(" -------- resultado final --------");
        System.out.println("Total acumulado: " + Acumulador);
        System.out.println("Cantidad de numeros procesados: " + Contador);
    }
}
