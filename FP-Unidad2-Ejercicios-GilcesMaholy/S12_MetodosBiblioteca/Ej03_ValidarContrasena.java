/*
 * Sesión: S12 - Métodos de biblioteca
 * Ejercicio 03: Validar una contraseña
 * Enunciado: mínimo 8 caracteres, al menos una mayúscula y un dígito (Character).
 * Autor: Gilces Maholy
 * Fecha: 19/11/2026
 */

public class Ej03_ValidarContrasena {

    static boolean esValida(String clave) {
        if (clave.length() < 8) {
            return false;
        }

        boolean hayMayuscula = false;
        boolean hayDigito = false;

        for (int i = 0; i < clave.length(); i++) {
            char c = clave.charAt(i);
            if (Character.isUpperCase(c)) {
                hayMayuscula = true;
            }
            if (Character.isDigit(c)) {
                hayDigito = true;
            }
        }

        return hayMayuscula && hayDigito;
    }

    public static void main(String[] args) {
        String[] pruebas = {"hola", "holamundo", "Holamundo", "Holamundo1", "HOLA1234"};

        for (int i = 0; i < pruebas.length; i++) {
            if (esValida(pruebas[i])) {
                System.out.println(pruebas[i] + " -> válida");
            } else {
                System.out.println(pruebas[i] + " -> NO válida");
            }
        }
    }
}
