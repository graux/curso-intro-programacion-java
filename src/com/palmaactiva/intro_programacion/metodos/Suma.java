package com.palmaactiva.intro_programacion.metodos;

public class Suma {
    
    public static void main(String[] args) {
        int resultado = suma(20, 16);
        System.out.println("El resultado es: " + resultado);
    }

    public static int suma(int valor1, int valor2) {
        return valor1 + valor2;
    }
}
