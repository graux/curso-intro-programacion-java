package com.palmaactiva.intro_programacion.modulo2.figuras;

import com.palmaactiva.intro_programacion.modulo2.figuras.formas.Cuadrado;
import com.palmaactiva.intro_programacion.modulo2.figuras.formas.Linea;
import com.palmaactiva.intro_programacion.modulo2.figuras.formas.Triangulo;
import com.palmaactiva.intro_programacion.modulo2.figuras.utiles.UtilesFiguras;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaFiguras {

    List<Figura> misFiguras;
    Actualizable actualizable;

    public FabricaFiguras(Actualizable actualizable) {
        misFiguras = new ArrayList<>();
        this.actualizable = actualizable;
    }

    public void pintarFiguras(Graphics canvas) {
        Graphics2D canvas2D = (Graphics2D) canvas;
        for (Figura forma : this.misFiguras) {
            forma.pintar(canvas2D);
        }
    }

    public void addFigura(Figura nuevFigura) {
        this.misFiguras.add(nuevFigura);
        this.actualizable.actualizar();
    }

    public void crearLinea() {
        Point p1 = UtilesFiguras.getPuntoAleatorio();
        Point p2 = UtilesFiguras.getPuntoAleatorio();
        Linea nuevaLinea = new Linea(p1, p2);

        this.addFigura(nuevaLinea);
    }

    public void crearCuadrado() {
        Point p1 = UtilesFiguras.getPuntoAleatorio();
        Point p2 = UtilesFiguras.getPuntoAleatorio();
        Cuadrado nuevoCuadrado = new Cuadrado(p1, p2);

        this.addFigura(nuevoCuadrado);
    }

    public void crearFiguraAleatoria() {
        String[] figuras = new String[]{"linea", "cuadrado", "triangulo"};
        int indice = new Random().nextInt(figuras.length);
        switch (figuras[indice]) {
            case "linea":
                this.crearLinea();
                break;
            case "cuadrado":
                this.crearCuadrado();
                break;
            case "triangulo":
                this.crearTriangulo();
                break;
        }
    }

    private void crearTriangulo() {
        Point centro = UtilesFiguras.getPuntoAleatorio();
        Random rnd = new Random();
        int radio = 50 + rnd.nextInt(150);
        int grados = rnd.nextInt(360);
        Figura nuevoTriangulo;
        if (rnd.nextBoolean()) {
            nuevoTriangulo = new Triangulo(centro, radio, grados);
        } else {
            nuevoTriangulo = new Triangulo(centro, radio, grados, Color.RED);
        }
        this.addFigura(nuevoTriangulo);
    }
}
