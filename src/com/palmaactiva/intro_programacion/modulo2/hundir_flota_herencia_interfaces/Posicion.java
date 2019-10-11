package com.palmaactiva.intro_programacion.modulo2.hundir_flota_herencia_interfaces;

public class Posicion implements Posicionable {

    protected int fila;
    protected int columna;

    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public boolean sobrePosicion(Posicion pos) {
        return this.fila == pos.fila && this.columna == pos.columna;
    }

    public boolean equals(Posicion pos) {
        return this.sobrePosicion(pos);
    }

    @Override
    public boolean seSolapaCon(Posicion pos) {
        return this.sobrePosicion(pos);
    }

    @Override
    public Posicion[] getPosiciones() {
        // Las posiciones de una posición es un array con una posición, ella misma
        return new Posicion[]{this};
    }
}
