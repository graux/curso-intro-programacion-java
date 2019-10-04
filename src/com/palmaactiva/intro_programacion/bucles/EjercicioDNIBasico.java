package com.palmaactiva.intro_programacion.bucles;

public class EjercicioDNIBasico {

    public static void main(String[] args) {
        int numeroDNI = 44123456;
        System.out.println("Vamos a usar el DNI: " + numeroDNI);
        char letraDNI = getLetraDNI(numeroDNI);
        System.out.println("Tu Letra DNI es '" + letraDNI + "' y tu DNI completo es: " + numeroDNI + "-" + letraDNI);
    }

    public static char getLetraDNI(int numeroDNI) {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E'};
        int indiceLetra = numeroDNI % letrasDNI.length; // letrasDNI.length es 23
        return letrasDNI[indiceLetra];
    }

    public static char getLetraDNI2(int numeroDNI) {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indiceLetra = numeroDNI % letrasDNI.length(); // letrasDNI.length es 23
        return letrasDNI.charAt(indiceLetra);
    }
}
