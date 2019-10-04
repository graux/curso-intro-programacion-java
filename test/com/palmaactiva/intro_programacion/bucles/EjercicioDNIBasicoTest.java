package com.palmaactiva.intro_programacion.bucles;

import org.junit.Test;
import static org.junit.Assert.*;

public class EjercicioDNIBasicoTest {

    static final int[] DNIS = {41825516, 39069251, 98711276, 85119463, 44285108};
    static final char[] LETRAS = {'Q', 'W', 'Z', 'M', 'B'};

    @Test
    public void testGetLetraDNI() {
        System.out.println("getLetraDNI");
        char resultado;
        for (int index = 0; index < DNIS.length; index++) {
            resultado = EjercicioDNIBasico.getLetraDNI(DNIS[index]);
            assertEquals(LETRAS[index], resultado);
        }
    }

    @Test
    public void testGetLetraDNI2() {
        System.out.println("getLetraDNI2");
        char resultado;
        for (int index = 0; index < DNIS.length; index++) {
            resultado = EjercicioDNIBasico.getLetraDNI2(DNIS[index]);
            assertEquals(LETRAS[index], resultado);
        }
    }
}
