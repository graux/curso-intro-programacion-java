package com.palmaactiva.intro_programacion.metodos;

class Ejemplo {

    public static void main(String[] args) {
        String textoPrueba = null;
        boolean esVacio = esTextoVacio(textoPrueba);
        System.out.println("Es vacio: " + esVacio);
        textoPrueba = "null";
        esVacio = esTextoVacio(textoPrueba);
        System.out.println("Es vacio: " + esVacio);
    }

    public static boolean esTextoVacio(String text) {
        if (text != null) {
            if (text.trim().length() > 0) {
                return false;
            }
        }
        return true;
    }
}
