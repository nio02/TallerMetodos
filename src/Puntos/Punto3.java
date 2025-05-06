package Puntos;

import java.util.Scanner;

public class Punto3 {
    public static double sumar(double a, double b){
        return a + b;
    }

    public static double restar(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
//        if (b == 0){
//            System.out.println("No se puede dividir entre cero.");
//            return 0;
//        }
        return a / b;
    }

    public static double potencia (double numero, double potencia){
        return Math.pow(numero, potencia);
    }

    public static void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);

        boolean bandera = true;

        do {
            System.out.println("Menú");
            System.out.println("Elige una opción: \n1. Sumar numeros \n2. Restar numeros \n3. Multiplicar numeros \n4. Dividir numeros \n5. Calcular la potencia de un número \n6. Salir");
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Escribe el primer numero: ");
                    double sum1 = scanner.nextDouble();
                    System.out.println("Escribe el segundo numero: ");
                    double sum2 = scanner.nextDouble();

                    System.out.println("La suma es: " + sumar(sum1, sum2));
                    break;
                case 2:
                    System.out.println("Escribe el primer numero: ");
                    double res1 = scanner.nextDouble();
                    System.out.println("Escribe el segundo numero: ");
                    double res2 = scanner.nextDouble();

                    System.out.println("La resta es: " + restar(res1, res2));
                    break;
                case 3:
                    System.out.println("Escribe el primer numero: ");
                    double mul1 = scanner.nextDouble();
                    System.out.println("Escribe el segundo numero: ");
                    double mul2 = scanner.nextDouble();

                    System.out.println("La multiplicación es: " + multiplicar(mul1, mul2));
                    break;
                case 4:
                    System.out.println("Escribe el dividendo: ");
                    double div1 = scanner.nextDouble();
                    System.out.println("Escribe el divisor: ");
                    double div2 = scanner.nextDouble();
                    if (div2 == 0){
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        System.out.println("La división es: " + dividir(div1, div2));
                    }
                    break;
                case 5:
                    System.out.println("Escribe tu numero: ");
                    double numero = scanner.nextDouble();
                    System.out.println("Escribe la potencia: ");
                    double potencia = scanner.nextDouble();

                    System.out.println("El numero " + numero + " elevado a " + potencia + " es: " + potencia(numero, potencia));
                    break;
                case 6:
                    System.out.println("Gracias por usar la calculadora.");
                    bandera = false;
                    break;
                default:
                    System.out.println("Ingrese una opción válida.");
            }
        } while (bandera);
    }
}
