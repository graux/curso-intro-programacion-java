package com.palmaactiva.intro_programacion.modulo2.viajeros;

import com.palmaactiva.intro_programacion.modulo2.viajeros.modelos.Ciudad;
import com.palmaactiva.intro_programacion.modulo2.viajeros.modelos.MedioTransporte;
import com.palmaactiva.intro_programacion.modulo2.viajeros.modelos.Viajero;
import java.util.List;

public class TerminalViajeros {

    public static void main(String[] args) {
        Ciudad[] ciudades = Ciudad.WESTEROS;
        List<Viajero> misPersonajes = Viajero.generarViajerosAleatorios(5);
        BrokerTransporte.asignarViajes(misPersonajes, ciudades);

        mostrarListaObjetos(misPersonajes);
    }

    public static void mostrarListaObjetos(List objetos) {
        for (Object objeto : objetos) {
            System.out.println(objeto);
        }
    }
}
