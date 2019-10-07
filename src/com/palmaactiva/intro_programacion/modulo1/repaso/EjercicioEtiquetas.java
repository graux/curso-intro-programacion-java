package com.palmaactiva.intro_programacion.modulo1.repaso;

import com.palmaactiva.intro_programacion.modulo1.utiles.Terminal;
import java.util.Calendar;

public class EjercicioEtiquetas {

    public static void main(String[] args) {
        System.out.println("Escribe tu año de nacimiento: ");
        int añoNacimiento = Terminal.leerInt();
        int edadCalculada = getEdad(añoNacimiento);
        String etiqueta = getEtiqueta(edadCalculada);
        System.out.println("Tienes " + edadCalculada + " años y tu estado es: " + etiqueta);
    }

    public static int getEdad(int año) {
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        return añoActual - año;
    }

    public static String getEtiqueta(int edad) {
        String etiqueta = "jubilado";
        if (edad <= 0) {
            etiqueta = "En proyecto";
        } else if (edad < 6) {
            etiqueta = "Bebe";
        } else if (edad < 18) {
            etiqueta = "Estudiante";
        } else if (edad < 65) {
            etiqueta = "Activo";
        }
        return etiqueta;
    }
}
