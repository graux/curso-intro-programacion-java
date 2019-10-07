package com.palmaactiva.intro_programacion.modulo1.repaso;

import com.palmaactiva.intro_programacion.modulo1.utiles.Terminal;

public class EjercicioRepeticionesLetra {

    public static void main(String[] args) {
        System.out.println("Por favor introduce un texto:");
        String texto = Terminal.leerString();
        System.out.println("Por favor introduce la letra que deseas buscar:");
        char letra = Terminal.leerChar();

        // Solución 1. Usando leerString y cogiendo el primer carácter.
        int numeroApariciones1 = getNumLetrasStringChar(texto, letra);
        // Solución 2. Usando Strings únicamente.
        int numeroApariciones2 = getNumLetrasString(texto, letra);
        System.out.println("Solución 1: La letra aparece " + numeroApariciones1 + " veces.");
        System.out.println("Solución 2: La letra aparece " + numeroApariciones2 + " veces.");
    }

    public static int getNumLetrasStringChar(String texto, char letra) {
        // Ponemos el texto en minúsculas para comparar mejor.
        texto = texto.toLowerCase();
        // Ponemos la letra en minúsculas también
        letra = Character.toString(letra).toLowerCase().charAt(0);
        int numeroApariciones = 0;
        // Uso toCharArray para convertir la String a un char[] y poderlo recorrer
        // usando un bucle for each.
        for (char letraEnTexto : texto.toCharArray()) {
            // Si es la misma letra, entonces incrementamos el contador.
            if (letra == letraEnTexto) {
                numeroApariciones++;
            }
        }
        return numeroApariciones;
    }

    public static int getNumLetrasString(String texto, char letra) {
        String letraStr = Character.toString(letra);
        int numeroApariciones = 0;
        String letraEnTexto;
        for (int indice = 0; indice < texto.length(); indice++) {
            // Extraemos una sub-string de un carácter de longitud y comparamos.
            letraEnTexto = texto.substring(indice, indice + 1);
            // Si es la misma letra, entonces incrementamos el contador. String es objeto,
            // por tanto tenemos que comparar con equals.
            // equalsIgnoreCase hace la comprobación sin importar mayúsculas o minúsculas.
            if (letraStr.equalsIgnoreCase(letraEnTexto)) {
                numeroApariciones++;
            }
        }
        return numeroApariciones;
    }
}
