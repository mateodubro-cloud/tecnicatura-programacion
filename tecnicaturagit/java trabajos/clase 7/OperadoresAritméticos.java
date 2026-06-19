
package operadores.aritméticos;


public class OperadoresAritméticos {

    public static void main(String[] args) {
        
        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
        
        solucion = num1 * num2;
System.out.println("solucion de la multiplicación = " + solucion);

solucion = num1 / num2;
System.out.println("solucion de la división = " + solucion);

var solucion2 = 3.4 / num2;
System.out.println("solucion2 resultado de la división = " + solucion2);

solucion = num1 % num2; // Guarda el residuo entero de la división
System.out.println("solucion = " + solucion2);

if (num1 % 2 == 0)
    System.out.println("Es un número Par");
else
    System.out.println("Es un número Impar");
    }
    
}
