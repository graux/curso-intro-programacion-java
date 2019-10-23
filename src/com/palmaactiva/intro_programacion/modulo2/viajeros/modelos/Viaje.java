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
        String viaje = String.format("%-16s - %-16s = %5.1f km", this.origen.nombre, this.destino.nombre, this.kmViaje);
        if (this.medioTransporte != null) {
            viaje += "   " + this.medioTransporte + String.format(" - %10.2f$ - %6.1f Horas", this.precioViaje, this.horasViaje);
        }
        return viaje;
    }

    float getPrecioViaje() {
        return this.precioViaje;
    }

    public Viaje(Ciudad origen, Ciudad destino) {
        this.origen = origen;
        this.destino = destino;
        this.kmViaje = this.origen.getDistanciaA(destino);
    }

    public void setMedioTransporte(MedioTransporte mTrans) {
        this.medioTransporte = mTrans;
        this.precioViaje = this.kmViaje * mTrans.getPrecioPorKm();
        this.horasViaje = this.kmViaje / mTrans.getKilometrosPorHora();
    }

    public MedioTransporte getMedioTransporte() {
        return this.medioTransporte;
    }
}
