package com.palmaactiva.intro_programacion.modulo3.ejercicio_diccionario_serializacion;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {

    public enum Idioma {
        INGLÉS, ESPAÑOL
    }

    private final Map<String, Traduccion> diccionarioInglés;
    private final Map<String, Traduccion> diccionarioEspañol;

    public Diccionario() {
        this.diccionarioInglés = new HashMap<>();
        this.diccionarioEspañol = new HashMap<>();
    }

    public void añadirTérmino(Traduccion nuevaTraduccion) {
        String keyEspañol = nuevaTraduccion.get(Diccionario.Idioma.ESPAÑOL).toLowerCase();
        String keyInglés = nuevaTraduccion.get(Diccionario.Idioma.INGLÉS).toLowerCase();
        this.diccionarioEspañol.put(keyEspañol, nuevaTraduccion);
        this.diccionarioInglés.put(keyInglés, nuevaTraduccion);
    }

    public String traducir(Diccionario.Idioma idiomaOrigen, String termino) {
        Idioma idiomaDestino = null;
        Map<String, Traduccion> diccionario = null;
        if (idiomaOrigen == Idioma.ESPAÑOL) {
            idiomaDestino = Idioma.INGLÉS;
            diccionario = diccionarioEspañol;
        } else {
            idiomaDestino = Idioma.ESPAÑOL;
            diccionario = diccionarioInglés;
        }
        String key = termino.toLowerCase();
        if (diccionario.containsKey(key)) {
            return diccionario.get(key).get(idiomaDestino);
        } else {
            return null;
        }
    }

    public int getNumTerminos() {
        return this.diccionarioEspañol.size();
    }

    public Traduccion[] getTraducciones() {
        return this.diccionarioInglés.values().toArray(new Traduccion[this.diccionarioInglés.size()]);
    }
}
