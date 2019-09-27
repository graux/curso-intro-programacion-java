package com.palmaactiva.intro_programacion.metodos;

public class Operaciones {

    public static void main(String[] args) {
        int numeroEntero = 10;
        System.out.println("Incremento:   " + incremento(numeroEntero));
        System.out.println("Incremento 2: " + incremento2(numeroEntero));
        System.out.println("Decremento:   " + decremento(numeroEntero));
        System.out.println("Multiplicar:  " + multiplicar(numeroEntero, 5));
        System.out.println("Doblar:       " + doblar(numeroEntero));
        System.out.println("Triplicar:    " + triplicar(numeroEntero));
        System.out.println("Dividir:      " + dividir(numeroEntero, 3));
    }

    public static int incremento(int numero) {
        numero = numero + 1;
        return numero;
    }

    public static int incremento2(int numero) {
        numero++;
        return numero;
    }

    public static int decremento(int numero) {
        return numero - 1;
    }

    public static int multiplicar(int numero, int multiplicador) {
        return numero * multiplicador;
    }

    public static int doblar(int numero) {
        return multiplicar(numero, 2);
    }

    public static int triplicar(int numero) {
        numero *= 3;
        return numero;
    }

    public static float dividir(int numero, float divisor) {
        return numero / divisor;
    }
}
