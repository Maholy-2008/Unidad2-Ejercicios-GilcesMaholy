/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 03: Traza del contador static
 * Enunciado: hacer la traza de un programa con un contador static llamado desde un for.
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

public class Ej03_TrazaContadorStatic {

    static int contador = 0;

    static void incrementar() {
        contador = contador + 1;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            incrementar();
            System.out.println("i = " + i + ", contador = " + contador);
        }
        System.out.println("Final: " + contador);
    }
}

/*
 * TRAZA (línea | variables vivas | valor)
 * Línea 11 | contador                | contador = 0 (se crea al iniciar la clase)
 * Línea 18 | i, contador            | i = 1, contador = 0
 * Línea 19 | i, contador            | llama a incrementar()
 * Línea 14 | contador               | contador = 0 + 1 = 1
 * Línea 20 | i, contador            | imprime: i = 1, contador = 1
 * Línea 18 | i, contador            | i = 2, contador = 1
 * Línea 19 | i, contador            | llama a incrementar()
 * Línea 14 | contador               | contador = 1 + 1 = 2
 * Línea 20 | i, contador            | imprime: i = 2, contador = 2
 * Línea 18 | i, contador            | i = 3, contador = 2
 * Línea 19 | i, contador            | llama a incrementar()
 * Línea 14 | contador               | contador = 2 + 1 = 3
 * Línea 20 | i, contador            | imprime: i = 3, contador = 3
 * Línea 18 | contador               | i = 4 no cumple i <= 3, el for termina (i ya no existe)
 * Línea 22 | contador               | imprime: Final: 3
 *
 * Nota: contador es static, por eso conserva su valor entre las llamadas.
 * La variable i solo existe mientras corre el for.
 */
