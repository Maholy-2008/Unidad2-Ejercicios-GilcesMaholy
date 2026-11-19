/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 04: Reescribir sin static
 * Enunciado: reescribir un programa que usa 3 atributos static para que use parámetros y return.
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

public class Ej04_ReescribirSinStatic {

    /* VERSIÓN ORIGINAL (con 3 atributos static):
     *
     * static int x = 4;
     * static int y = 5;
     * static int suma;
     *
     * static void sumar() {
     *     suma = x + y;
     * }
     *
     * public static void main(String[] args) {
     *     sumar();
     *     System.out.println("La suma es " + suma);
     * }
     */

    static int sumar(int x, int y) {
        int suma = x + y;
        return suma;
    }

    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        int suma = sumar(x, y);
        System.out.println("La suma es " + suma);
    }
}
