
package conversión.de.tipos.parte.pkg1;

import java.util.Scanner;


public class ConversiónDeTiposParte1 {

    
    public static void main(String[] args) {
        // Conversión de tipos primitivos
var edad = Integer.parseInt("20");
System.out.println("edad = " + (edad + 1));

var valorPI = Double.parseDouble("3.1416");
System.out.println("valorPI = " + valorPI);

// Pedir un valor
var entrada = new Scanner (System.in);
System.out.println("Digite su edad:");
edad = Integer.parseInt(entrada.nextLine());

System.out.println("edad = " + edad);
    }
    
}
