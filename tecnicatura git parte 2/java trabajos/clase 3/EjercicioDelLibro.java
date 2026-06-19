
package ejercicio.del.libro;

import java.util.Scanner;

public class EjercicioDelLibro {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("digite el nombre del libro: ");
       var nombreDelLibro = entrada.nextLine();
       System.out.println("ingrese el nombre del autor: ");
       var nombreDelAutor = entrada.nextLine();
       System.out.println(nombreDelLibro + " fue escrito por " + nombreDelAutor);
    }
    
}
