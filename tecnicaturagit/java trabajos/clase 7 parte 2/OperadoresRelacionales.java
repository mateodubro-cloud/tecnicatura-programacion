
package operadores.relacionales;


public class OperadoresRelacionales {

    
    public static void main(String[] args) {
        var aNum = 5;
var bNum = 4;

var cNum = (aNum == bNum);
System.out.println("cNum = " + cNum);

var dNum = aNum != bNum;
System.out.println("dNum = " + dNum);

var cadenaA = "Hello";
var cadenaB = "Hello";

var cVar = cadenaA == cadenaB;
System.out.println("cVar = " + cVar);

var fVar = cadenaA.equals(cadenaB);
    }
    
}
