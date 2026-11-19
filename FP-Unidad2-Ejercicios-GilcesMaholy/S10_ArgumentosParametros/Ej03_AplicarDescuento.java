/*
 * Sesión: S10 - Argumentos y parámetros
 * Ejercicio 03: Aplicar descuento
 * Enunciado: aplicarDescuento(double[] precios, double pct) que modifique todo el arreglo.
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

public class Ej03_AplicarDescuento {

    static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {
            precios[i] = precios[i] - (precios[i] * pct / 100);
        }
    }

    static void mostrar(double[] precios) {
        for (int i = 0; i < precios.length; i++) {
            System.out.print(precios[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] precios = {10.0, 20.0, 50.0, 100.0};

        System.out.print("Precios antes:   ");
        mostrar(precios);

        aplicarDescuento(precios, 10);

        System.out.print("Precios después: ");
        mostrar(precios);
    }
}
