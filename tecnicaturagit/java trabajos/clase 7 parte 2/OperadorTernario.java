package operador.ternario;

public class OperadorTernario {

    public static void main(String[] args) {
        var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta) {

            System.out.println("esta dentro del tiempo");
        } else {
            System.out.println("esta fuera del tiempo establecido");
        }

        var vacaciones = false;
        var diaLibre = false;
        if (vacaciones || diaLibre) {
            System.out.println("papa puede asistir al juego de su hijo");
        } else {
            System.out.println("papa no puede asistir al juego de su hijo");
        }

    }

}
