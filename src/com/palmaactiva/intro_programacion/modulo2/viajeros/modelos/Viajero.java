package com.palmaactiva.intro_programacion.modulo2.viajeros.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Viajero {

    private final String nombre;
    private final String apellido;
    private final float presupuestoViaje;
    private Viaje elViaje;

    public Viaje getElViaje() {
        return elViaje;
    }

    public void setElViaje(Viaje elViaje) {
        this.elViaje = elViaje;
    }

    private static final String[] NOMBRES = {"John", "Robert", "Cersei", "Tyrion", "Rickard", "Melara", "Euron", "Balon", "Stannis", "Sansa", "Rhaegar", "Samwell", "Joffrey", "Daenerys"};
    private static final String[] APELLIDOS = {"Stark", "Lanister", "Greyjoy", "Turly", "Baratheon", "Targaryen", "Martell", "Frey"};

    public Viajero(String nombre, String apellido, float presupuestoViaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.presupuestoViaje = presupuestoViaje;
    }

    public static Viajero generarViajeroAleatorio() {
        Random aleatorio = new Random();
        int posAleatoria = aleatorio.nextInt(NOMBRES.length);
        String nombre = NOMBRES[posAleatoria];
        String apellido = APELLIDOS[aleatorio.nextInt(APELLIDOS.length)];
        float presupuesto = 20.0f + aleatorio.nextFloat() * (2000f - 20f);

        return new Viajero(nombre, apellido, presupuesto);
    }

    public static List<Viajero> generarViajerosAleatorios(int numViajeros) {
        List<Viajero> misViajeros = new ArrayList<>();
        Viajero miViajero;
        while (misViajeros.size() < numViajeros) {
            miViajero = generarViajeroAleatorio();
            if (!misViajeros.contains(miViajero)) {
                misViajeros.add(miViajero);
            }
        }
        return misViajeros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-12s", this.nombre));
        sb.append(String.format("%-12s", this.apellido));
        sb.append(String.format("%10.2f", this.presupuestoViaje));

        if (this.elViaje != null) {
            sb.append(" | " + this.elViaje);
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Viajero) {
            Viajero objViajero = (Viajero) obj;
            return this.nombre == objViajero.nombre && this.apellido == objViajero.apellido;
        }
        return false;
    }

    public boolean esMedioTransporteValido() {
        MedioTransporte mt = this.elViaje.getMedioTransporte();
        if (this.elViaje.kmViaje < mt.getAutonomia()) {
            return this.elViaje.getPrecioViaje() <= this.presupuestoViaje;
        }
        return false;
    }
}
