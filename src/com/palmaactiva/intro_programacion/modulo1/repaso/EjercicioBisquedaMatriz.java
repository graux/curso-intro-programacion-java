package com.palmaactiva.intro_programacion.modulo1.repaso;

import com.palmaactiva.intro_programacion.modulo1.utiles.Terminal;

public class EjercicioBisquedaMatriz {

    public static void main(String[] args) {
        System.out.println("¿Cuántas FILAS va a tener tu Matriz?");
        int numFilas = Terminal.leerInt();
        System.out.println("¿Cuántas COLUMNAS va a tener tu Matriz?");
        int numColumnas = Terminal.leerInt();
        System.out.println("Tu matriz es " + numFilas + "x" + numColumnas);
        int[][] miMatriz = EjercicioMatriz.generarMatriz(numFilas, numColumnas);
        EjercicioMatriz.printMatriz(miMatriz);

        // Segunda parte Ejercicio.
        System.out.println("¿Qué número quieres que busquemos?");
        int numeroBusqueda = Terminal.leerInt();
        // Se invoca otro método para buscar el número.
        buscarNumero(miMatriz, numeroBusqueda);
        //buscarNumero2(miMatriz, numeroBusqueda);
    }

    public static void buscarNumero(int[][] matriz, int numeroBusqueda) {
        // Creamos una variable para detectar si se ha encontrado o no el número.
        boolean encontrado = false;
        // Creamos una variable para guardar la posición si se encuentra el número.
        String textoPosicion = null;
        // Comprobamos que recorremos las filas y que aún no se haya encontrado el número
        for (int indiceFilas = 0; !encontrado && indiceFilas < matriz.length; indiceFilas++) {
            // Comprobamos que recorremos las columnas y que aún no se haya encontrado el número
            for (int indiceCols = 0; !encontrado && indiceCols < matriz[indiceFilas].length; indiceCols++) {
                // Si es el mismo número
                if (numeroBusqueda == matriz[indiceFilas][indiceCols]) {
                    // Marcamos que hemos encontrado el elemento. 
                    // Los bucles no continuarán una vez comprueben su condición.
                    encontrado = true;
                    // Guardamos la posición actual.
                    textoPosicion = (indiceFilas + 1) + "," + (indiceCols + 1);
                }
            }
        }
        // Si hemos encontrado el elemento.
        if (encontrado) {
            // Mostramos la posición donde se econtró el elemento.
            System.out.println("El elemento aparece por primera vez en la posición: " + textoPosicion);
        } else {
            System.out.println("El número no se ha encontrado en la matriz.");
        }
    }

    public static void buscarNumero2(int[][] matriz, int numeroBusqueda) {
        // Creamos una variable para detectar si se ha encontrado o no el número.
        boolean encontrado = false;
        // Creamos una variable para guardar la posición si se encuentra el número.
        String textoPosicion = null;
        // Comprobamos que recorremos las filas y que aún no se haya encontrado el número
        for (int indiceFilas = 0; indiceFilas < matriz.length; indiceFilas++) {
            // Comprobamos que recorremos las columnas y que aún no se haya encontrado el número
            for (int indiceCols = 0; indiceCols < matriz[indiceFilas].length; indiceCols++) {
                // Si es el mismo número
                if (numeroBusqueda == matriz[indiceFilas][indiceCols]) {
                    // Marcamos que hemos encontrado el elemento.
                    encontrado = true;
                    // Guardamos la posición actual.
                    textoPosicion = (indiceFilas + 1) + "," + (indiceCols + 1);
                    // Salimos del primer bucle si hemos encontrado el elemento
                    break;
                }
            }
            if (encontrado) {
                // Salimos del segundo bucle si se ha encontrado el elemento.
                break;
            }
        }
        // Si hemos encontrado el elemento.
        if (encontrado) {
            // Mostramos la posición donde se econtró el elemento.
            System.out.println("El elemento aparece por primera vez en la posición: " + textoPosicion);
        } else {
            System.out.println("El número no se ha encontrado en la matriz.");
        }
    }
}
