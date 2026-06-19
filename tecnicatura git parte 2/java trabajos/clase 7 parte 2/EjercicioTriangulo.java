
package pkg8.pkg7.ejercicio.triangulo;

import java.util.Scanner;

public class EjercicioTriangulo {

    
    public static void main(String[] args) {
        Scanner triangulo = new Scanner(System.in);
         System.out.print("Ingrese la base: ");
        double base = triangulo.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = triangulo.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

        // Mayor de dos números con operador ternario
        System.out.print("Ingrese el primer número: ");
        int num1 = triangulo.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = triangulo.nextInt();

        int mayor = (num1 > num2) ? num1 : num2;

        System.out.println("El mayor es: " + mayor);
    }
    
}
