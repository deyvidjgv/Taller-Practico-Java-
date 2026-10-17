package com.taller.practico;

    public class Debug2 {
        public static void main(String[] args){

            System.out.println(" -------- debug 2: desfase por uno --------");
            int totalElementos = 5;

            System.out.println("Imprimiendo elementos del 1 al " + totalElementos + ":");

            // correccion: era i < totalElementos y se saltaba el 5
            for (int i = 1; i <= totalElementos; i++) {
                System.out.println("Elemento " + i);
            }
        }
    }
