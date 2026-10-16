package seccion_2;
import java.util.Scanner;

    public class Ejercicio3_1 {
        public static void main(String[] args){

            Scanner console = new Scanner(System.in);

            int n = 0;
            int resultado = 0;


            System.out.print("digite un numero: ");
            n = console.nextInt();

            System.out.println(" -------- tabla del " + n + " --------");
            for (int i = 1; i <= 12; i++){
                resultado = n * i;
                System.out.printf("%d x %2d = %d%n", n, i, resultado);
            }

            System.out.println(" -------- conteo regresivo --------");
            for (int j = n; j >= 0; j--){
                System.out.println(j);
            }

            System.out.println("fin del conteo");
        }
    }
