
package tipo.primitivo.pkgchar.parte.pkg2;


public class TipoPrimitivoCharParte2 {

    
    public static void main(String[] args) {
       char varCaracter = '\u0024'; // Indicamos a Java la asignación con el código unicode
System.out.println("varCaracter = " + varCaracter);

char varCaracterDecimal = 36; // Valor decimal del juego de caracteres unicode
System.out.println("varCaracterDecimal = " + varCaracterDecimal);

char varCaracterSimbolo = '$'; // Un carácter especial, podemos copiar y pegar desde unicode
System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);


var varCaracter1 = '\u0024'; // Indicamos a Java la asignación con el código unicode
System.out.println("varCaracter1 = " + varCaracter1);

var varCaracterDecimal1 = (char)36; // Valor entero y le asigna un tipo int
System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);

var varCaracterSimbolo1 = '$'; // Un carácter especial, podemos copiar y pegar desde unicode
System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);


int varEnteroChar = '$';
System.out.println("varEnteroChar = " + varEnteroChar);

int caracterChar = 'b';
System.out.println("caracterChar = " + caracterChar);
    }
    
}
