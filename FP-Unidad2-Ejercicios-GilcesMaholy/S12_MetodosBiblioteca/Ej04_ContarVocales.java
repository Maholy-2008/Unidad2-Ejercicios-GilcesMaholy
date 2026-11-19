/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 04: Contar vocales
 * Enunciado: contar las vocales de una frase usando String y Character, contando mayúsculas y minúsculas.
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

public class Ej04_ContarVocales {

    public static void main(String[] args) {
        String frase = "Hoy Estoy Aprendiendo Java en la Universidad";
        int vocalesMayusculas = 0;
        int vocalesMinusculas = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            char minuscula = Character.toLowerCase(letra);

            if (minuscula == 'a' || minuscula == 'e' || minuscula == 'i'
                    || minuscula == 'o' || minuscula == 'u') {
                if (Character.isUpperCase(letra)) {
                    vocalesMayusculas++;
                } else {
                    vocalesMinusculas++;
                }
            }
        }

        System.out.println("Frase: " + frase);
        System.out.println("Vocales mayúsculas: " + vocalesMayusculas);
        System.out.println("Vocales minúsculas: " + vocalesMinusculas);
        System.out.println("Total de vocales: " + (vocalesMayusculas + vocalesMinusculas));
    }
}
