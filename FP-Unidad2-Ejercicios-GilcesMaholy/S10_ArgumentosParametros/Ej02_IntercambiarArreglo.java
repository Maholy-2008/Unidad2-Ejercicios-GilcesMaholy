/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 02: Intercambiar en un arreglo
 * Enunciado: escribir intercambiar(int[] v, int i, int j) que intercambie dos posiciones del arreglo. ¿Ahora sí?
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

public class Ej02_IntercambiarArreglo {

    static void intercambiar(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    static void mostrar(int[] v) {
        for (int k = 0; k < v.length; k++) {
            System.out.print(v[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.print("Antes:   ");
        mostrar(numeros);

        intercambiar(numeros, 0, 4);

        System.out.print("Después: ");
        mostrar(numeros);
    }
}

/*
 * ¿Por qué ahora sí funciona?
 * Porque un arreglo es un objeto y lo que se pasa al método es la
 * dirección (referencia) donde está guardado. Entonces el método y el
 * main trabajan con el MISMO arreglo, no con una copia. Por eso cuando
 * el método cambia v[i] y v[j], el cambio también se ve en el main.
 */
