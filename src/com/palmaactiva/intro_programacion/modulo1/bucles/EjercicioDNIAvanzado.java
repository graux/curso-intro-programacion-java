package com.palmaactiva.intro_programacion.modulo1.bucles;

import com.palmaactiva.intro_programacion.modulo1.utiles.Terminal;

public class EjercicioDNIAvanzado {

    public static void main(String[] args) {
        System.out.println("Por favor, introduce tu número de DNI:");
        int numeroDNI = Terminal.leerInt();
        char letraDNI = getLetraDNI(numeroDNI);
        System.out.println("Tu Letra DNI es '" + letraDNI + "' y tu DNI completo es: " + numeroDNI + "-" + letraDNI);
    }

    public static char getLetraDNI(int numeroDNI) {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indiceLetra = numeroDNI % letrasDNI.length(); // letrasDNI.length() es 23
        return letrasDNI.charAt(indiceLetra);
    }
}
