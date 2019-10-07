package com.palmaactiva.intro_programacion.modulo1.estructuras_control;

import java.text.Normalizer;

public class EjercicioSwitchNombresDia {

    public static void main(String[] args) {
        System.out.println("El día Lunes es: " + getNumDiaSemana("Lunes"));
        System.out.println("El día DOMINGO es: " + getNumDiaSemana("DOMINGO"));
        System.out.println("El día MiércOLES es: " + getNumDiaSemana("MiércOLES"));
        System.out.println("El día miercoles es: " + getNumDiaSemana("miercoles"));
        System.out.println("El día BlaBla es: " + getNumDiaSemana("BlaBla"));        
    }

    public static int getNumDiaSemana(String nombre) {
        // Pasamos la string a minúsculas
        String nombreLower = nombre.trim().toLowerCase();
        // Convertimos los acentos a carácteres: sábado a s´abado
        String caracteres = Normalizer.normalize(nombreLower, Normalizer.Form.NFD);
        // Eliminamos los carácteres de acentuación
        String sinAcentos = caracteres.replaceAll("[^\\p{ASCII}]", "");
        switch (sinAcentos) {
            case "lunes":
                return 1;
            case "martes":
                return 2;
            case "miercoles":
                return 3;
            case "jueves":
                return 4;
            case "viernes":
                return 5;
            case "sabado":
                return 6;
            case "domingo":
                return 7;
            default:
                return -1;
        }
    }
}
