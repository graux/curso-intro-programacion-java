package com.palmaactiva.intro_programacion.modulo3.personas_dni;

import com.palmaactiva.intro_programacion.modulo1.bucles.EjercicioDNIAvanzado;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class AppPersonasDNI {

    private static final String[] NOMBRES = new String[]{"Fran", "Jose", "Paco", "Pepe", "Maria", "Marta", "Sandra",
        "Ana", "Lucía", "Sofia", "Roberto", "Álvaro", "Clara"};
    private static final String[] APELLIDOS = new String[]{"Garcia", "Fernández", "Martínez", "Torres", "Hernandez",
        "Martín", "Pons", "González", "Rodríguez", "López", "Sánchez", "Ruíz", "Navarro", "Marí", "Tur", "Pons",
        "Coll"};
    private final HashMap<String, Persona> socios;

    public AppPersonasDNI() {
        this.socios = new HashMap<>();
    }

    private void crearSocios(int numSocios) {
        Persona socio;
        System.out.println("Creando socios:");
        for (int indice = 0; indice < numSocios; indice++) {
            socio = crearSocioAleatorio();
            this.socios.put(socio.getDNI(), socio);
            System.out.println("  " + (indice + 1) + ".- " + socio.toString());
        }
    }

    private Persona crearSocioAleatorio() {
        Random aleatorio = new Random();
        int numeroDni = this.numeroAleatorio(10000000, 99999999);
        String dni = String.valueOf(numeroDni) + EjercicioDNIAvanzado.getLetraDNI(numeroDni);
        String nombre = NOMBRES[aleatorio.nextInt(NOMBRES.length)];
        String apellido = APELLIDOS[aleatorio.nextInt(APELLIDOS.length)];

        return new Persona(nombre, apellido, dni, crearFechaNacimientoAleatoria());
    }

    private Date crearFechaNacimientoAleatoria() {
        GregorianCalendar gc = new GregorianCalendar();
        int year = numeroAleatorio(1900, 2010);
        gc.set(GregorianCalendar.YEAR, year);
        int dayOfYear = numeroAleatorio(1, gc.getActualMaximum(GregorianCalendar.DAY_OF_YEAR));
        gc.set(GregorianCalendar.DAY_OF_YEAR, dayOfYear);
        return gc.getTime();
    }

    private int numeroAleatorio(int inicio, int fin) {
        Random aleatorio = new Random();
        return aleatorio.nextInt(fin - inicio) + inicio;
    }

    public static void main(String[] args) {
        AppPersonasDNI miPrograma = new AppPersonasDNI();
        miPrograma.crearSocios(200);

        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduce el DNI del socio a buscar:");
            String dni = teclado.nextLine();
            if (dni.equalsIgnoreCase("salir")) {
                salir = true;
            } else {
                if (miPrograma.socios.containsKey(dni)) {
                    System.out.println(miPrograma.socios.get(dni));
                    System.out.println();
                } else {
                    System.out.println("No se encontró el socio.");
                }
            }

        } while (!salir);
        teclado.close();
    }
}
