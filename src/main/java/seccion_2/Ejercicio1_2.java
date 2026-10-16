package seccion_2;
import java.util.Scanner;

    public class Ejercicio1_2 {
        public static void main(String[] args){

            Scanner console = new Scanner(System.in);

            boolean procesando = true;
            int monto = 0;
            int total = 0;
            int limite = 1000000;
            int transacciones = 0;
            String causa = "";


            while(procesando){
                System.out.println(" -------- caja --------");
                System.out.print("digite el monto de la transaccion: ");
                monto = console.nextInt();

                if (monto < 0){
                    procesando = false;
                    causa = "se ingreso un monto negativo";
                    System.out.println("monto no valido, se cierra la caja");
                } else {
                    total = total + monto;
                    transacciones++;
                    System.out.println("transaccion registrada");
                    System.out.println("total acumulado: " + total);

                    if (total > limite){
                        procesando = false;
                        causa = "se supero el limite de 1000000";
                        System.out.println("se paso del limite, se cierra la caja");
                    }
                }
            }

            System.out.println(" -------- informe --------");
            System.out.println("saldo final: " + total);
            System.out.println("transacciones procesadas: " + transacciones);
            System.out.println("causa: " + causa);
        }
    }
