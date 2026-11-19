/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 04: Sobrecarga de perimetro
 * Enunciado: sobrecargar perimetro(double lado) (cuadrado) y perimetro(double a, double b) (rectángulo).
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

public class Ej04_SobrecargaPerimetro {

    static double perimetro(double lado) {
        return 4 * lado;
    }

    static double perimetro(double a, double b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        double perimetroCuadrado = perimetro(5);
        double perimetroRectangulo = perimetro(4, 6);

        System.out.println("Perímetro del cuadrado de lado 5: " + perimetroCuadrado);
        System.out.println("Perímetro del rectángulo de 4 x 6: " + perimetroRectangulo);
    }
}
