package seccion_2;

    public class Ejercicio4_1 {
        public static void main(String[] args){

            int encontrado = 0;
            int revisados = 0;
            boolean hayNumero = false;


            System.out.println(" -------- buscando del 1 al 100 --------");
            for (int i = 1; i <= 100; i++){
                revisados++;

                if (i % 7 == 0 && i % 11 == 0){
                    encontrado = i;
                    hayNumero = true;
                    System.out.println("numero encontrado: " + i);
                    break;
                }
            }

            if (hayNumero == true){
                System.out.println("el primer numero divisible entre 7 y 11 es: " + encontrado);
            } else {
                System.out.println("no se encontro ningun numero");
            }
            System.out.println("numeros revisados: " + revisados);
        }
    }
