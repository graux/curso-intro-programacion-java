package com.palmaactiva.intro_programacion.bucles;

public class LetraCentral {

    public static void main(String[] args) {
        String texto = "Esto es un ejercicio de Strings";
        System.out.println("El texto del ejercico es: " + texto);

        char letraCentral = getLetraCentral(texto);
        System.out.println("La letra central es: " + letraCentral);
    }

    public static char getLetraCentral(String texto) {
        if (texto == null) {
            return ' ';
        }
        int posicionCentral = texto.length() / 2;
        return texto.charAt(posicionCentral);
    }
}
