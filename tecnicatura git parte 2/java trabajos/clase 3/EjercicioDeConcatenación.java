
package ejerciciodeconcatenación;


public class EjercicioDeConcatenación {

    
    public static void main(String[] args) {
        var usuario = "Mateo";
        var profesion = "Estudiante";
        var union = profesion + " " + usuario;
        System.out.println("union = " + union);
        
        var a = 9;
        var b = 4;
        System.out.println(usuario + (a + b));
    }
    
}
