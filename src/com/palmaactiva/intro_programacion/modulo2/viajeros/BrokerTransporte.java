package com.palmaactiva.intro_programacion.modulo2.viajeros;

import com.palmaactiva.intro_programacion.modulo2.viajeros.modelos.Ciudad;
import com.palmaactiva.intro_programacion.modulo2.viajeros.modelos.MedioTransporte;
import com.palmaactiva.intro_programacion.modulo2.viajeros.modelos.Viaje;
import com.palmaactiva.intro_programacion.modulo2.viajeros.modelos.Viajero;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BrokerTransporte {

    public static void generarViajeViajero(Viajero viajero, Ciudad[] ciudades) {
        Random aleatorio = new Random();
        int indiceOrigen = aleatorio.nextInt(ciudades.length);
        int indiceDestino;
        do {
            indiceDestino = aleatorio.nextInt(ciudades.length);
        } while (indiceDestino == indiceOrigen);
        Viaje nuevoViaje = new Viaje(ciudades[indiceOrigen], ciudades[indiceDestino]);
        viajero.setElViaje(nuevoViaje);
    }

    public static void asignarViajes(List<Viajero> viajeros, Ciudad[] ciudades) {
        for (Viajero viajero : viajeros) {
            generarViajeViajero(viajero, ciudades);
        }
    }

    public static MedioTransporte[] generarMediosTransporte() {
        return new MedioTransporte[]{
            MedioTransporte.crearMedioAPie(),
            MedioTransporte.crearMedioCaballo(),
            MedioTransporte.crearMedioCarruaje(),
            MedioTransporte.crearMedioBarcoMercante(),
            MedioTransporte.crearMedioDragon()
        };
    }

    public static void asignarMediosTransporte(List<Viajero> misPersonajes) {
        for (Viajero pers : misPersonajes) {
            asignarMedioTransporte(pers);
        }
    }

    public static void asignarMedioTransporte(Viajero personaje) {
        MedioTransporte medioTrans;
        List<String> tiposUsados = new ArrayList<>();
        do {
            medioTrans = MedioTransporte.crearMedioTransporteAleatorio();
            if (!tiposUsados.contains(medioTrans.getNombre())) {
                tiposUsados.add(medioTrans.getNombre());
                personaje.getElViaje().setMedioTransporte(medioTrans);
            }
        } while (!personaje.esMedioTransporteValido() && tiposUsados.size() < 5);
    }
}
