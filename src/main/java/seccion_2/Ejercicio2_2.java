package seccion_2;
import java.util.Scanner;

    public class Ejercicio2_2 {
        public static void main(String[] args){

            Scanner console = new Scanner(System.in);

            int opcion = 0;
            int saldo = 0;
            int deposito = 0;
            int retiro = 0;


            do {
                System.out.println(" -------- banco --------");
                System.out.println("1. Consultar Saldo");
                System.out.println("2. Realizar Deposito");
                System.out.println("3. Realizar Retiro");
                System.out.println("4. Salir del Sistema");
                System.out.print("elija una opcion: ");
                opcion = console.nextInt();

                switch (opcion){
                    case 1:
                        System.out.println("su saldo es: " + saldo);
                        break;
                    case 2:
                        System.out.print("digite el valor a depositar: ");
                        deposito = console.nextInt();
                        if (deposito > 0){
                            saldo = saldo + deposito;
                            System.out.println("deposito realizado");
                            System.out.println("saldo actual: " + saldo);
                        } else {
                            System.out.println("el deposito tiene que ser mayor a 0");
                        }
                        break;
                    case 3:
                        System.out.print("digite el valor a retirar: ");
                        retiro = console.nextInt();
                        if (retiro <= 0){
                            System.out.println("el retiro tiene que ser mayor a 0");
                        } else if (retiro > saldo){
                            System.out.println("saldo insuficiente");
                            System.out.println("saldo actual: " + saldo);
                        } else {
                            saldo = saldo - retiro;
                            System.out.println("retiro realizado");
                            System.out.println("saldo actual: " + saldo);
                        }
                        break;
                    case 4:
                        System.out.println("saliendo del sistema...");
                        break;
                    default:
                        System.out.println("opcion no valida, intente de nuevo");
                        break;
                }

            } while (opcion != 4);

            System.out.println("saldo final: " + saldo);
            System.out.println("gracias por usar el banco");
        }
    }
