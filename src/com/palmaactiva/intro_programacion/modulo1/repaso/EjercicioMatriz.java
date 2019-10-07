package com.palmaactiva.intro_programacion.modulo1.repaso;

import com.palmaactiva.intro_programacion.modulo1.utiles.Terminal;

public class EjercicioMatriz {

    public static void main(String[] args) {
        System.out.println("¿Cuántas FILAS va a tener tu Matriz?");
        int numFilas = Terminal.leerInt();
        System.out.println("¿Cuántas COLUMNAS va a tener tu Matriz?");
        int numColumnas = Terminal.leerInt();
        System.out.println("Tu matriz es " + numFilas + "x" + numColumnas);
        // Creamos una matriz vacía con las dos dimensiones leídas.
        int[][] matrizNumeros = generarMatriz(numFilas, numColumnas);
        // Llamamos a otro método para mostrar los elementos de la matriz.
        printMatriz(matrizNumeros);
    }

    public static int[][] generarMatriz(int filas, int columnas) {
        int[][] miMatriz = new int[filas][columnas];
        String textoPosicion = null;
        for (int indiceFilas = 0; indiceFilas < filas; indiceFilas++) {
            for (int indiceCols = 0; indiceCols < columnas; indiceCols++) {
                // Preparamos el texto de la posición.
                textoPosicion = (indiceFilas + 1) + "," + (indiceCols + 1);
                System.out.println("Introduce el número para la posición [" + textoPosicion + "] :");
                // Asignamos el valor leído a la posición de la matriz.
                miMatriz[indiceFilas][indiceCols] = Terminal.leerInt();
            }
        }
        return miMatriz;
    }

    public static void printMatriz(int[][] matriz) {
        System.out.println("Tu MATRIZ es: ");
        // Recorremos las filas
        for (int[] filas : matriz) {
            // Recorremos las celdas/columnas de cada fila
            for (int celda : filas) {
                // String format %5d muestra un número ocupando 5 espacios. Ejemplo "    3" "  333"
                System.out.print(String.format("%5d", celda));
            }
            System.out.println();
        }
    }
}
