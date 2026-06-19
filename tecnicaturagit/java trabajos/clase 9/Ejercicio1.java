
package ejercicio1;

import java.util.Scanner;
public class Ejercicio1 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
         float nota1, nota2, nota3, promedio;

        System.out.print("Digite la primera calificación: ");
        nota1 = Float.parseFloat(entrada.nextLine());

        System.out.print("Digite la segunda calificación: ");
        nota2 = Float.parseFloat(entrada.nextLine());

        System.out.print("Digite la tercera calificación: ");
        nota3 = Float.parseFloat(entrada.nextLine());

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 70) {
            System.out.println("El alumno APRUEBA el curso.");
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("El alumno REPRUEBA el curso.");
            System.out.println("Promedio: " + promedio);
        }
    }
}
