import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner teclado = new Scanner (System.in);
    
      System.out.print("Ingrese un segundo numero: ");
        int numero1 = teclado.nextInt();
        
        System.out.print("ingrese un segundo numero: ");
        int numero2 = teclado.nextInt();
        
        if (numero1 == numero2) {
        System.out.println(numero1 * numero2);
        } else if (numero1 > numero2) {
            System.out.println(numero1 - numero2);
        } else if (numero1 < numero2) {
        System.out.println(numero1 + numero2);
        
        }
        
        teclado.close();
    }
        
      
}
