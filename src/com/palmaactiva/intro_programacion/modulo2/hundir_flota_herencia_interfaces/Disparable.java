package com.palmaactiva.intro_programacion.modulo2.hundir_flota_herencia_interfaces;

public interface Disparable extends Posicionable, Dibujable {

    public void hundir(Posicion pos);

    default public boolean disparar(Disparo disparo) {
        Posicionable[] posiciones = this.getPosiciones();
        for (Posicionable posicion : posiciones) {
            if (posicion.seSolapaCon(disparo)) {
                this.hundir(disparo);
                return true;
            }
        }
        return false;
    }
}
