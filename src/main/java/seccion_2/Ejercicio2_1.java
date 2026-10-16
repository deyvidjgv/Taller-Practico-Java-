package seccion_2;
import java.util.Scanner;

    public class Ejercicio2_1 {
        public static void main(String[] args){

            Scanner console = new Scanner(System.in);

            int pin = 0;
            int intentos = 0;
            boolean valido = false;


            do {
                System.out.println(" -------- cajero --------");
                System.out.print("ingrese su pin de 4 digitos: ");
                pin = console.nextInt();
                intentos++;

                if (pin >= 1000 && pin <= 9999){
                    valido = true;
                } else {
                    valido = false;
                    System.out.println("Error: La clave debe tener exactamente 4 dígitos positivos");
                }

            } while (valido == false);

            System.out.println(" -------- resultado --------");
            System.out.println("pin aceptado: " + pin);
            System.out.println("intentos realizados: " + intentos);
        }
    }
