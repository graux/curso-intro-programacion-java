package com.palmaactiva.intro_programacion.modulo2.viajeros.modelos;

public class Ciudad {

    public final String nombre;
    private final Posicion posicion;

    public static final Ciudad CIUDAD_WINTERFELL = new Ciudad("Winterfell", 5f, 3.0f);
    public static final Ciudad CIUDAD_KINGSLANDING = new Ciudad("Kings Landing", 5f, 6.0f);
    public static final Ciudad CIUDAD_CATERLYROCK = new Ciudad("Casterly Rock", 1f, 6.0f);
    public static final Ciudad CIUDAD_STORMSEND = new Ciudad("Storm's End", 6f, 7.0f);
    public static final Ciudad CIUDAD_RIVERRUN = new Ciudad("Riverrun", 3f, 5.0f);
    public static final Ciudad CIUDAD_HIGHGARDEN = new Ciudad("Highgarden", 3.5f, 7.5f);
    public static final Ciudad CIUDAD_SUNSPEAR = new Ciudad("Sunspear", 8f, 9f);

    public static final Ciudad[] WESTEROS = {CIUDAD_WINTERFELL, CIUDAD_KINGSLANDING, CIUDAD_CATERLYROCK,
        CIUDAD_STORMSEND, CIUDAD_RIVERRUN, CIUDAD_HIGHGARDEN, CIUDAD_SUNSPEAR};

    public Ciudad(String nombre, Posicion lugar) {
        this.nombre = nombre;
        this.posicion = lugar;
    }

    public Ciudad(String nombre, float posX, float posY) {
        this.nombre = nombre;
        this.posicion = new Posicion(posX, posY);
    }

    public float getDistanciaA(Ciudad laOtraCiudad) {
        float x1 = this.posicion.posX;
        float y1 = this.posicion.posY;
        float x2 = laOtraCiudad.posicion.posX;
        float y2 = laOtraCiudad.posicion.posY;

        return 20f * (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
