package com.palmaactiva.intro_programacion.bucles;

public class InvertirTexto {

    public static void main(String[] args) {
        String texto = "Hola PalmaActiva, estamos programando en JAVA";
        String textoInvertido = getTextoInvertido(texto);
        System.out.println("El texto invertido es: " + textoInvertido);
    }

    public static String getTextoInvertido(String texto) {
        String textoInvertido = "";
        for (int indice = texto.length() - 1; indice >= 0; indice--) {
            textoInvertido = textoInvertido + texto.charAt(indice);
        }
        return textoInvertido;
    }
}
