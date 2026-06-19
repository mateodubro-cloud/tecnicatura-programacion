
package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota de participación: ");
        double participacion = sc.nextDouble();

        System.out.print("Ingrese la nota del primer parcial: ");
        double parcial1 = sc.nextDouble();

        System.out.print("Ingrese la nota del segundo parcial: ");
        double parcial2 = sc.nextDouble();

        System.out.print("Ingrese la nota del examen final: ");
        double examenFinal = sc.nextDouble();

        double notaFinal =
                (participacion * 0.10) +
                (parcial1 * 0.25) +
                (parcial2 * 0.25) +
                (examenFinal * 0.40);

        System.out.println("La calificación final es: " + notaFinal);

        sc.close();
    }
}