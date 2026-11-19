/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 02: Líneas que no compilan
 * Enunciado: indicar qué líneas no compilan y por qué.
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

public class Ej02_LineasNoCompilan {

    static void sumar() {
        int total = 3 + 4;
    }

    public static void main(String[] args) {
        int x = 5;

        {
            int y = 10;
        }
        // System.out.println(y);
        // Error: cannot find symbol (symbol: variable y)
        // Causa: y se declaró dentro de un bloque { } y fuera de él ya no existe.

        for (int i = 0; i < 3; i++) {
            System.out.println("vuelta " + i);
        }
        // System.out.println(i);
        // Error: cannot find symbol (symbol: variable i)
        // Causa: i solo existe dentro del for.

        // int x = 7;
        // Error: variable x is already defined in method main(String[])
        // Causa: ya existe una variable x en el main, no se puede declarar otra igual.

        sumar();
        // System.out.println(total);
        // Error: cannot find symbol (symbol: variable total)
        // Causa: total es local del método sumar, el main no la puede ver.

        // String texto = 10;
        // Error: incompatible types: int cannot be converted to String
        // Causa: a un String no se le puede guardar un número directamente.

        System.out.println("x vale " + x);
    }
}
