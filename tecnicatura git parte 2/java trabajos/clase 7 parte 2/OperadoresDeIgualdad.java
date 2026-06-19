
package operadores.de.igualdad;


public class OperadoresDeIgualdad {

    
    public static void main(String[] args) {
       // Operadores Unarios de Incremento: Preincremento

var varE = 9;
var varF = ++varE;

System.out.println("varE = " + varE);
System.out.println("varF = " + varF);

// Operadores Unarios de Incremento: Postincremento

var varG = 3;
var varH = varG++;

System.out.println("varG = " + varG);
System.out.println("varH = " + varH);

// Operadores Unarios de Decremento

var varI = 4;
var varJ = --varI;

System.out.println("varI = " + varI);
System.out.println("varJ = " + varJ);

var varK = 8;
var varL = varK --;
System.out.println("varK = " + varK);
System.out.println("varL = " + varL);
    }
    
}
