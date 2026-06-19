
/*

Ejercicio 1: Construir un programa que, dado un número total de

horas, devuelve el número de semanas, días y horas equivalentes.

Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,

6 días y 16 horas.


 */


package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total de horas: ");
        int horas = sc.nextInt();

        int semanas = horas / 168; // 1 semana = 168 horas
        horas = horas % 168;

        int dias = horas / 24;
        horas = horas % 24;

        System.out.println("Semanas: " + semanas);
        System.out.println("DÃ­as: " + dias);
        System.out.println("Horas: " + horas);

        sc.close();
    }
}