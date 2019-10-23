package com.palmaactiva.intro_programacion.modulo3.personas_dni;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {

    private final String nombre;
    private final String apellidos;
    private final String dni;
    private final Date fechaNacimiento;
    private static final DateFormat FORMATO_FECHA = new SimpleDateFormat("dd-MM-yyyy");

    public Persona(String nombre, String apellidos, String dni, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    String getDNI() {
        return this.dni;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-12s", this.nombre));
        sb.append(String.format("%-12s", this.apellidos));
        sb.append(String.format("- %-12s", this.dni));
        sb.append(FORMATO_FECHA.format(this.fechaNacimiento));

        return sb.toString();
    }
}
