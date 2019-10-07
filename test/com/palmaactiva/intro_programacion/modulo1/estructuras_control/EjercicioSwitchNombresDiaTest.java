package com.palmaactiva.intro_programacion.modulo1.estructuras_control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuari
 */
public class EjercicioSwitchNombresDiaTest {

    /**
     * Test of getNumDiaSemana method, of class EjercicioSwitchNombresDia.
     */
    @Test
    public void testGetNumDiaSemana() {
        System.out.println("getNumDiaSemana");
        String nombre = "Miércoles";
        int expResult = 3;
        int result = EjercicioSwitchNombresDia.getNumDiaSemana(nombre);
        assertEquals(expResult, result);
    }

}
