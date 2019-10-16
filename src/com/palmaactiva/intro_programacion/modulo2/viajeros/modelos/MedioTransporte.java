package com.palmaactiva.intro_programacion.modulo2.viajeros.modelos;

import java.util.Random;

public class MedioTransporte {

    private final String nombre;
    private final float autonomia;
    private final float precioPorKm;
    private final float kilometrosPorHora;

    private MedioTransporte(String nombre, float autonomia, float precioPorKm, float kilometrosPorHora) {
        this.nombre = nombre;
        this.autonomia = autonomia;
        this.precioPorKm = precioPorKm;
        this.kilometrosPorHora = kilometrosPorHora;
    }

    public static MedioTransporte crearMedioAPie() {
        return new MedioTransporte("Pie", 5f, 1f, 6f);
    }

    public static MedioTransporte crearMedioCaballo() {
        return new MedioTransporte("Caballo", 40f, 5f, 18f);
    }

    public static MedioTransporte crearMedioCarruaje() {
        return new MedioTransporte("Carruaje", 120f, 20f, 10f);
    }

    public static MedioTransporte crearMedioBarcoMercante() {
        return new MedioTransporte("BarcoMercante", 400f, 80f, 14f);
    }

    public static MedioTransporte crearMedioDragon() {
        return new MedioTransporte("Dragon", 840f, 5000f, 60f);
    }

    public static MedioTransporte crearMedioTransporteAleatorio() {
        Random aleatorio = new Random();
        int valorAleatorio = aleatorio.nextInt(5);
        switch (valorAleatorio) {
            case 0:
                return crearMedioAPie();
            case 1:
                return crearMedioCaballo();
            case 2:
                return crearMedioCarruaje();
            case 3:
                return crearMedioBarcoMercante();
            case 4:
                return crearMedioDragon();
        }
        return null;
    }
}
