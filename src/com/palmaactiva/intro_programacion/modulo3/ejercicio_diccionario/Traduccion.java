package com.palmaactiva.intro_programacion.modulo3.ejercicio_diccionario;

public class Traduccion {

    private final String español;
    private final String inglés;

    public Traduccion(String terminoEspañol, String terminoIngles) {
        this.español = terminoEspañol.toLowerCase();
        this.inglés = terminoIngles.toLowerCase();
    }

    public String get(Diccionario.Idioma idioma) {
        switch (idioma) {
            case ESPAÑOL:
                return this.español;
            case INGLÉS:
                return this.inglés;
        }
        return null;
    }
}
