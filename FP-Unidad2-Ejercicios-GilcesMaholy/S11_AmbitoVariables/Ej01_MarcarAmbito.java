/*
 * Sesión: S11 - Ámbito de las variables
 * Ejercicio 01: Marcar ámbitos
 * Enunciado: programa con un comentario en cada variable que diga si es local, de bloque o static.
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

public class Ej01_MarcarAmbito {

    static int contadorGlobal = 0;            // static: existe en toda la clase
    static String curso = "Fundamentos";      // static: existe en toda la clase

    public static void main(String[] args) {
        int edad = 18;                        // local: vive en todo el main
        double nota = 15.5;                   // local: vive en todo el main

        for (int i = 0; i < 3; i++) {         // i es de bloque: solo existe dentro del for
            int doble = i * 2;                // de bloque: solo existe dentro del for
            contadorGlobal = contadorGlobal + doble;
            System.out.println("i = " + i + ", doble = " + doble + ", contador = " + contadorGlobal);
        }

        if (edad >= 18) {
            String mensaje = "Mayor de edad";  // de bloque: solo existe dentro del if
            System.out.println(mensaje);
        }

        System.out.println("Curso: " + curso + ", nota: " + nota);
        mostrar();
    }

    static void mostrar() {
        int copia = contadorGlobal;           // local: solo existe dentro de mostrar
        System.out.println("Contador final: " + copia);
    }
}
