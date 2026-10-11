package com.taller.practico;
import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("entrego el proyecto?, si es verdadero escribe 1 - si es falso escribe 2 : ");
        boolean  entregoProyectoFinal = consola.nextInt() == 1;

        System.out.println(("Ingresa la calificacion de 0 a 100"));
        float calificacionFinal = consola.nextFloat();

        System.out.println("Ingresa el porcentaje de asistencia de 0 a 100");
        int porcentajeAsistencia = consola.nextInt();

        String estado;

        if (calificacionFinal >= 70.0 && porcentajeAsistencia >= 80) {
            estado = "Aprobado";
        } else if (entregoProyectoFinal && calificacionFinal >= 60.0) {
            estado = "Pendiente de Examen Extraordinario";
        } else {
            estado = "Reprobado";
        }

        System.out.println("Dictamen academico: " + estado);
    }
}
