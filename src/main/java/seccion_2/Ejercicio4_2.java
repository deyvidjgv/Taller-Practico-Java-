package seccion_2;

    public class Ejercicio4_2 {
        public static void main(String[] args){

            int mostrados = 0;
            int omitidos = 0;


            System.out.println(" -------- numeros pares que no son multiplos de 5 --------");
            for (int i = 1; i <= 50; i++){

                if (i % 2 != 0){
                    omitidos++;
                    continue;
                }

                if (i % 5 == 0){
                    omitidos++;
                    continue;
                }

                System.out.println(i);
                mostrados++;
            }

            System.out.println(" -------- resumen --------");
            System.out.println("numeros mostrados: " + mostrados);
            System.out.println("numeros omitidos: " + omitidos);
            System.out.println("total revisados: " + (mostrados + omitidos));
        }
    }
