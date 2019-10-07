package com.palmaactiva.intro_programacion.modulo1.estructuras_control;

public class EjemploSwitch {

    public static void main(String[] args) {
        System.out.println("El día 1 es: " + getDiaSemana(1));
        System.out.println("El día 3 es: " + getDiaSemana(3));
        System.out.println("El día 5 es: " + getDiaSemana(5));
        System.out.println("El día 7 es: " + getDiaSemana(7));
        System.out.println("El día 9 es: " + getDiaSemana(9));
    }

    public static String getDiaSemana(int numDia) {
        if (numDia < 1 || numDia > 7) {
            return null;
        }
        String nombreDia = null;
        switch (numDia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
        }
        return nombreDia;
    }
}
