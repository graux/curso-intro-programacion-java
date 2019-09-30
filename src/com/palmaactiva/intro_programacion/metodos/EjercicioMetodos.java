package com.palmaactiva.intro_programacion.metodos;

public class EjercicioMetodos {

    public static void main(String[] args) {
        String nombre = "Fran";
        String resultado = saludar(nombre);
        resultado = añadirEdad(resultado, 30);
        resultado = sabeJava(resultado, true);
        System.out.println("El Resultado es: " + resultado);
    }

    public static String saludar(String nombre) {
        return "Hola " + nombre;
    }

    public static String añadirEdad(String texto, int edad) {
        return texto + ", tienes " + edad + " años";
    }

    public static String sabeJava(String texto, boolean sabe) {
        if (sabe) {
            return texto + " y sabes programar en Java.";
        }
        return texto + " y tienes que estudiar.";
    }

    public static String sabeJavaTernario(String texto, boolean sabe) {
        String opcionTrue = " y sabes programar en Java.";
        String opcionFalse = " y tienes que estudiar.";
        return texto + (sabe ? opcionTrue : opcionFalse);
    }
}
