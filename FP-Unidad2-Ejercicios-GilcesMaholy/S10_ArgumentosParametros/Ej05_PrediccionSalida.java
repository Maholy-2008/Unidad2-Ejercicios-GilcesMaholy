/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 05: Predicción de salida
 * Enunciado: predecir en papel la salida de un programa con 3 llamadas antes de ejecutarlo.
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

public class Ej05_PrediccionSalida {

    static int duplicar(int x) {
        x = x * 2;
        return x;
    }

    static void sumarUno(int x) {
        x = x + 1;
    }

    static void ponerCero(int[] v) {
        v[0] = 0;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] datos = {7, 8, 9};

        int r = duplicar(n);
        System.out.println("n = " + n + ", r = " + r);

        sumarUno(n);
        System.out.println("n = " + n);

        ponerCero(datos);
        System.out.println("datos[0] = " + datos[0]);
    }
}

/*
 * SALIDA PREDICHA (la hice en papel antes de ejecutar):
 * n = 5, r = 10
 * n = 5
 * datos[0] = 0
 *
 * Mi razonamiento: duplicar y sumarUno reciben una copia de n, así que
 * n no cambia (sigue en 5). En cambio ponerCero recibe el arreglo
 * por referencia, por eso sí cambia datos[0].
 *
 * SALIDA REAL (al ejecutar):
 * n = 5, r = 10
 * n = 5
 * datos[0] = 0
 *
 * Coincidió con lo que predije.
 */
