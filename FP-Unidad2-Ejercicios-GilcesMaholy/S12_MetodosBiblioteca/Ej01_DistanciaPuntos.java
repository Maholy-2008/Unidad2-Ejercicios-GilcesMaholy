/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 01: Distancia entre dos puntos
 * Enunciado: calcular la distancia entre dos puntos con Math.sqrt y Math.pow.
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

public class Ej01_DistanciaPuntos {

    static double distancia(double x1, double y1, double x2, double y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    public static void main(String[] args) {
        double d = distancia(1, 2, 4, 6);
        System.out.println("La distancia entre (1,2) y (4,6) es: " + d);
    }
}
