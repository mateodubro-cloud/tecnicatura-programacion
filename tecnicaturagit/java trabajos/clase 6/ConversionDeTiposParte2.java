
package conversion.de.tipos.parte.pkg2;

import java.util.Scanner;


public class ConversionDeTiposParte2 {

    
    public static void main(String[] args) {
        
       var entrada = new Scanner (System.in);
        var edadTexto = String.valueOf(10);
        
        
        System.out.println("edadTexto = " + edadTexto);
        var fraseChar = "programadores".charAt(4);
        
        System.out.println("fraseChar = " + fraseChar);
        
       System.out.println("digite un caracter ");
       fraseChar = entrada.nextLine().charAt(0);
       System.out.println("fraseChar = " + fraseChar);
        
    
                
                
                
  
    }
}
