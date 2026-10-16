package seccion_2;
import java.util.Scanner;

    public class EjercicioIntegrador {
        public static void main(String[] args){

            Scanner console = new Scanner(System.in);

            int opcion = 0;
            int capacidad = 500;
            int unidades = 0;
            int productosRegistrados = 0;
            int descontinuados = 0;
            long valorInventario = 0;

            int n = 0;
            int precio = 0;
            int cantidad = 0;
            String respuesta = "";


            do {
                System.out.println(" -------- almacen --------");
                System.out.println("1. Registrar Lote de Productos");
                System.out.println("2. Ver Estado del Almacen");
                System.out.println("3. Salir");
                System.out.print("elija una opcion: ");
                opcion = console.nextInt();

                switch (opcion){
                    case 1:
                        System.out.print("cuantos productos tiene el lote: ");
                        n = console.nextInt();

                        for (int i = 1; i <= n; i++){
                            System.out.println(" -------- producto " + i + " de " + n + " --------");

                            System.out.print("el producto esta descontinuado? (s/n): ");
                            respuesta = console.next();
                            if (respuesta.equalsIgnoreCase("s")){
                                descontinuados++;
                                System.out.println("producto descontinuado, no se registra");
                                continue;
                            }

                            System.out.print("digite el precio: ");
                            precio = console.nextInt();
                            while (precio <= 0){
                                System.out.println("el precio tiene que ser mayor a 0");
                                System.out.print("digite el precio: ");
                                precio = console.nextInt();
                            }

                            System.out.print("digite la cantidad en stock: ");
                            cantidad = console.nextInt();
                            while (cantidad <= 0){
                                System.out.println("la cantidad tiene que ser mayor a 0");
                                System.out.print("digite la cantidad en stock: ");
                                cantidad = console.nextInt();
                            }

                            if (unidades + cantidad > capacidad){
                                System.out.println("ALERTA: sobrecupo, el almacen no tiene espacio para " + cantidad + " unidades");
                                System.out.println("se cancela el resto del lote");
                                break;
                            }

                            unidades = unidades + cantidad;
                            valorInventario = valorInventario + (long) precio * cantidad;
                            productosRegistrados++;
                            System.out.println("producto registrado");
                            System.out.println("unidades en almacen: " + unidades + " de " + capacidad);
                        }
                        break;
                    case 2:
                        System.out.println(" -------- estado del almacen --------");
                        System.out.println("productos registrados: " + productosRegistrados);
                        System.out.println("productos descontinuados: " + descontinuados);
                        System.out.println("unidades en almacen: " + unidades + " de " + capacidad);
                        System.out.println("espacio disponible: " + (capacidad - unidades));
                        System.out.println("valor del inventario: " + valorInventario);
                        break;
                    case 3:
                        System.out.println("saliendo del sistema...");
                        break;
                    default:
                        System.out.println("opcion no valida, intente de nuevo");
                        break;
                }

            } while (opcion != 3);

            System.out.println("unidades finales en almacen: " + unidades);
        }
    }
