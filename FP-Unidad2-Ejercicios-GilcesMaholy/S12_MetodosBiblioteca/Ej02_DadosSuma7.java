/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 02: Dados que suman 7
 * Enunciado: lanzar dos dados 1000 veces y contar cuántas veces suman 7 (Random), mostrando el conteo y el porcentaje.
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

import java.util.Random;

public class Ej02_DadosSuma7 {

    public static void main(String[] args) {
        Random azar = new Random();
        int lanzamientos = 1000;
        int cuantasSuman7 = 0;

        for (int i = 0; i < lanzamientos; i++) {
            int dado1 = azar.nextInt(6) + 1;
            int dado2 = azar.nextInt(6) + 1;

            if (dado1 + dado2 == 7) {
                cuantasSuman7++;
            }
        }

        double porcentaje = cuantasSuman7 * 100.0 / lanzamientos;

        System.out.println("Lanzamientos: " + lanzamientos);
        System.out.println("Veces que sumaron 7: " + cuantasSuman7);
        System.out.println("Porcentaje: " + porcentaje + "%");
    }
}
