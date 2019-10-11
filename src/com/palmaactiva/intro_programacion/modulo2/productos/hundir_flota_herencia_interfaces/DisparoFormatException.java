package com.palmaactiva.intro_programacion.modulo2.productos.hundir_flota_herencia_interfaces;

public class DisparoFormatException extends Exception {

    private final String textoPosicion;

    public DisparoFormatException(String textoPosicion) {
        this.textoPosicion = textoPosicion;
    }

    @Override
    public String toString() {
        return "Error procesando la posición '" + this.textoPosicion + "'.";
    }
}
