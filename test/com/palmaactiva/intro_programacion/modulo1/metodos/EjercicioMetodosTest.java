package com.palmaactiva.intro_programacion.modulo1.metodos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fran Grau <fran@kydemy.com>
 */
public class EjercicioMetodosTest {

    @Test
    public void testSaludar() {
        System.out.println("saludar");
        String nombre = "Fran";
        String expResult = "Hola Fran";
        String result = EjercicioMetodos.saludar(nombre);
        assertEquals(expResult, result);
    }

    @Test
    public void testAñadirEdad() {
        System.out.println("a\u00f1adirEdad");
        String texto = "Hola Fran";
        int edad = 30;
        String expResult = "Hola Fran, tienes 30 años";
        String result = EjercicioMetodos.añadirEdad(texto, edad);
        assertEquals(expResult, result);
    }

    @Test
    public void testSabeJava() {
        System.out.println("sabeJava");
        String texto = "Hola Fran, tienes 30 años";
        boolean sabe = true;
        String expResult = "Hola Fran, tienes 30 años y sabes programar en Java.";
        String result = EjercicioMetodos.sabeJava(texto, sabe);
        assertEquals(expResult, result);
    }

    @Test
    public void testSabeJavaTernario() {
        System.out.println("sabeJava");
        String texto = "Hola Fran, tienes 30 años";
        boolean sabe = true;
        String expResult = "Hola Fran, tienes 30 años y sabes programar en Java.";
        String result = EjercicioMetodos.sabeJava(texto, sabe);
        assertEquals(expResult, result);
    }
}
