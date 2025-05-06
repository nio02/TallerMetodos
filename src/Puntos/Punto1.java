package Puntos;

import java.util.Scanner;

public class Punto1 {
    public static double metrosCentimetos(double metros){
        return metros * 100;
    }

    public static double kiloLibras(double kilo){
        return kilo / 0.454;
    }

    public static double celciusFarenheit(double celsius){
        double farenheit = (celsius * ((double) 9 / 5)) + 32;
        return farenheit;
    }

    public static void mostrarMensaje(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de metros que quiere convertir a centimetros: ");
        double metros = scanner.nextDouble();
        System.out.println("Ingrese el valor de kilos que quiere convertir a libras: ");
        double kilos = scanner.nextDouble();
        System.out.println("Ingrese el valor de °Celcius que quiere convertir a °Farenheit: ");
        double celcius = scanner.nextDouble();

        System.out.println("La conversion de 2 metros a centimetros es: " + metrosCentimetos(metros));
        System.out.println("La conversion de 4 Kilos a Libras es: " + kiloLibras(kilos));
        System.out.println("La conversion de 100°C a °F es: " + celciusFarenheit(celcius));

    }
}
