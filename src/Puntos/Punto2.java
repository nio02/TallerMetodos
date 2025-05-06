package Puntos;

import java.util.Scanner;

public class Punto2 {
    public static double promedio(double cal1, double cal2, double cal3){
        double promedio = (cal1 + cal2 + cal3) / 3;
        return promedio;
    }

    public static String finalCurso(double promedio){
        if (promedio >= 60){
            return "Aprobó";
        } else {
            return "Reprobó";
        }
    }

    public static void mostrarMensaje(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera calificación:");
        double nota1 = scanner.nextDouble();
        System.out.println("Ingrese la segunda calificación:");
        double nota2 = scanner.nextDouble();
        System.out.println("Ingrese la tercera calificación:");
        double nota3 = scanner.nextDouble();

        double promedio = promedio(nota1, nota2, nota3);

        System.out.println("El promedio es: " + promedio + "\nFinal: " + finalCurso(promedio));
        scanner.close();
    }
}
