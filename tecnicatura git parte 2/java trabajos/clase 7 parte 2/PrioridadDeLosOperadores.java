
package prioridad.de.los.operadores;


public class PrioridadDeLosOperadores {

    
    public static void main(String[] args) {
        var resultadoT = (5 > 8) ? "verdadero" : "falso";
        System.out.println("resultadot = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "es par" : "es impar";
        System.out.println("resultadoT = " + resultadoT);
    }
    
}
