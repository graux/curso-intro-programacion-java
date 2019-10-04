package com.palmaactiva.intro_programacion.bucles;

public class EjercicioMostrarNumeros {

    public static void main(String[] args) {
        int[] numeros = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        System.out.println("- Ejercicio Bucle For:");
        mostrarNumeros(numeros);

        System.out.println("\n-Ejercicio Bucle For Each:");
        mostrarNumerosForEach(numeros);

        System.out.println("\n-Ejercicio Bucle con Incremento:");
        mostrarNumerosMasUno(numeros);

        System.out.println("\n-Ejercicio Bucle For Invertido:");
        mostrarNumerosInvertidos(numeros);

        System.out.println("\nEjercicio Bucle For Pares:");
        mostrarNumerosPares(numeros);
    }

    public static void mostrarNumeros(int[] numeros) {
        int numero;
        for (int indice = 0; indice < numeros.length; indice++) {
            numero = numeros[indice];
            System.out.println("Índice " + indice + ",Número: " + numero);
        }
    }

    public static void mostrarNumerosForEach(int[] numeros) {
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }
    }

    public static void mostrarNumerosMasUno(int[] numeros) {
        for (int numero : numeros) {
            numero++;
            System.out.println("Número: " + numero);
        }
    }

    public static void mostrarNumerosInvertidos(int[] numeros) {
        int numero;
        for (int indice = numeros.length - 1; indice >= 0; indice--) {
            numero = numeros[indice];
            System.out.println("Número: " + numero);
        }
    }

    public static void mostrarNumerosPares(int[] numeros) {
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println("Número Par: " + numero);
            }
        }
    }
}
