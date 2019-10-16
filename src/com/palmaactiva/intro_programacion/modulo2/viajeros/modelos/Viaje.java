package com.palmaactiva.intro_programacion.modulo2.viajeros.modelos;

public class Viaje {

    public final Ciudad origen;
    public final Ciudad destino;
    public final float kmViaje;
    private MedioTransporte medioTransporte;
    private float precioViaje;
    private float horasViaje;

    @Override
    public String toString() {
        return String.format("%-12s - %-12s = %5.1f km", this.origen.nombre, this.destino.nombre, this.kmViaje);
    }

    public Viaje(Ciudad origen, Ciudad destino) {
        this.origen = origen;
        this.destino = destino;
        this.kmViaje = this.origen.getDistanciaA(destino);
    }
}
