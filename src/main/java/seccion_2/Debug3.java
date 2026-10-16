package seccion_2;

    public class Debug3 {
        public static void main(String[] args){

            System.out.println(" -------- debug 3: break mal ubicado --------");
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("Numero impar detectado: " + i);
                    continue; // correccion: el break cortaba el ciclo en la primera vuelta
                }
                System.out.println("Numero par procesado: " + i);
            }
        }
    }
