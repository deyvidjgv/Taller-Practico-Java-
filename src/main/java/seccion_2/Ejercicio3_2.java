package seccion_2;
import java.util.Scanner;

    public class Ejercicio3_2 {
        public static void main(String[] args){

            Scanner console = new Scanner(System.in);

            int n = 0;
            long factorial = 1;


            do {
                System.out.print("digite un numero entero positivo (1 a 20): ");
                n = console.nextInt();
                if (n < 1 || n > 20){
                    System.out.println("numero no valido, tiene que ser entre 1 y 20");
                }
            } while (n < 1 || n > 20);

            System.out.println(" -------- parte a: factorial --------");
            for (int i = 1; i <= n; i++){
                factorial = factorial * i;
            }
            System.out.println("el factorial de " + n + " es: " + factorial);

            System.out.println(" -------- parte b: triangulo --------");
            for (int fila = 1; fila <= n; fila++){
                for (int j = 1; j <= fila; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            System.out.println("fin del programa");
        }
    }
