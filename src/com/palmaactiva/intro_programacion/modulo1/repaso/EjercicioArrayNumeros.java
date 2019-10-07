package com.palmaactiva.intro_programacion.modulo1.repaso;

import com.palmaactiva.intro_programacion.modulo1.utiles.Terminal;

public class EjercicioArrayNumeros {

    public static void main(String[] args) {
        System.out.println("¿Cuántos números va a tener tu Array?");
        int numElementos = Terminal.leerInt();
        int[] arrayNumeros = pedirNumeros(numElementos);
        mostrarNumeros(arrayNumeros);
        int total = calcularTotal(arrayNumeros);
        System.out.println("La suma es: " + total);
    }

    public static int[] pedirNumeros(int numNumeros) {
        // Creamos un array vacío con el número de elementos que nos indica el Usuario.
        int[] elArray = new int[numNumeros];
        for (int indice = 0; indice < numNumeros; indice++) {
            System.out.println("Introduce el número " + (indice + 1) + ":");
            // Asignamos el número a al índice actual del bucle.
            elArray[indice] = Terminal.leerInt();
        }
        return elArray;
    }

    public static void mostrarNumeros(int[] arrayNumeros) {
        System.out.println("Tus números son: ");
        for (int numero : arrayNumeros) {
            // Escribimos todos los números sin cambios de línea.
            System.out.print(numero + " ");
        }
        // Cambiamos la línea al final
        System.out.println();
    }

    public static int calcularTotal(int[] arrayNumeros) {
        System.out.println("Tus números son: ");
        int suma = 0;
        for (int numero : arrayNumeros) {
            // Añadimos a suma, el número actual
            suma += numero;
        }
        return suma;
    }
}
