
package ejercicio.tienda.de.libros;

import java.util.Scanner;

public class EjercicioTiendaDeLibros {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite el nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        System.out.println("digite el id del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("digite el precio del libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.println("confirme si el envio es gratuito ");
        boolean envioGratuito = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println(nombreLibro+" #"+idLibro);
        System.out.println("precio del libro: $"+precioLibro);
        System.out.println("el envio del libro gratuito es: " + envioGratuito);
        
        
    }
    
}
