/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 05: Generar un código
 * Enunciado: generar un código de 6 caracteres: 3 letras aleatorias y 3 dígitos aleatorios.
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

import java.util.Random;

public class Ej05_GenerarCodigo {

    public static void main(String[] args) {
        Random azar = new Random();
        String codigo = "";

        for (int i = 0; i < 3; i++) {
            char letra = (char) ('A' + azar.nextInt(26));
            codigo = codigo + letra;
        }

        for (int i = 0; i < 3; i++) {
            int digito = azar.nextInt(10);
            codigo = codigo + digito;
        }

        System.out.println("Código generado: " + codigo);
    }
}
