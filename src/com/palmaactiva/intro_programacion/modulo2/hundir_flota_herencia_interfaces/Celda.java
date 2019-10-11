package com.palmaactiva.intro_programacion.modulo2.hundir_flota_herencia_interfaces;

public class Celda extends Posicion implements Disparable {

    private boolean hundida;

    public Celda(int fila, int columna) {
        super(fila, columna);
    }

    public boolean estaHundida() {
        return this.hundida;
    }

    @Override
    public String getStringCelda(Posicion pos) {
        // Si se ha disparado, mostrar agua, si no vacío
        return this.hundida ? "~" : " ";
    }

    @Override
    public void hundir(Posicion pos) {
        this.hundida = pos.seSolapaCon(this);
    }
}
