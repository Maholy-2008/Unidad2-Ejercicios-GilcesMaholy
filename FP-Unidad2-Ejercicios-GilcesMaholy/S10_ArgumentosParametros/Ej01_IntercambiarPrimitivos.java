/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 01: Intercambiar primitivos
 * Enunciado: escribir intercambiar(int a, int b) e intentar intercambiar dos variables de main. ¿Funciona? Explica.
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

public class Ej01_IntercambiarPrimitivos {

    static void intercambiar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Dentro del método: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Antes: x = " + x + ", y = " + y);
        intercambiar(x, y);
        System.out.println("Después: x = " + x + ", y = " + y);
    }
}

/*
 * ¿Funciona? ¿Por qué?
 * NO funciona. Dentro del método los valores sí se intercambian, pero
 * en el main x y y siguen igual (x = 5, y = 10).
 * Esto pasa porque en Java los datos primitivos se pasan por valor:
 * al llamar el método se envía una COPIA de x y de y. El método cambia
 * las copias (a y b) y no las variables originales del main.
 */
