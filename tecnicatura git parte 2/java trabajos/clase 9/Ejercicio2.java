
package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float compra, descuento, totalPagar;

        System.out.print("Digite el monto de la compra: ");
        compra = Float.parseFloat(entrada.nextLine());

        if (compra > 100) {
            descuento = compra * 0.20f;
            totalPagar = compra - descuento;
        } else {
            totalPagar = compra;
        }

        System.out.println("La cantidad a pagar es: $" + totalPagar);
    }
}