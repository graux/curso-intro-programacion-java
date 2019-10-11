package com.palmaactiva.intro_programacion.modulo2.figuras.formas;

import com.palmaactiva.intro_programacion.modulo2.figuras.Figura;
import com.palmaactiva.intro_programacion.modulo2.figuras.FiguraConArea;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Triangulo extends FiguraConArea implements Figura {

    private final Point punto1;
    private final Point punto2;
    private final Point punto3;

    public Triangulo(Point centro, int radio, int grados, Color color) {
        this(centro, radio, grados);
        this.colorRelleno = color;
    }

    public Triangulo(Point centro, int radio, int grados) {
        double rads = grados * Math.PI / 180;
        double posX = Math.sin(rads) * radio;
        double posY = Math.cos(rads) * radio;
        this.punto1 = new Point(centro.x + (int) posX, centro.y + (int) posY);

        rads = (grados + 120) * Math.PI / 180;
        posX = Math.sin(rads) * radio;
        posY = Math.cos(rads) * radio;
        this.punto2 = new Point(centro.x + (int) posX, centro.y + (int) posY);

        rads = (grados + 240) * Math.PI / 180;
        posX = Math.sin(rads) * radio;
        posY = Math.cos(rads) * radio;
        this.punto3 = new Point(centro.x + (int) posX, centro.y + (int) posY);
    }

    @Override
    public void pintar(Graphics2D canvas) {
        int[] posicionesX = {this.punto1.x, this.punto2.x, this.punto3.x};
        int[] posicionesY = {this.punto1.y, this.punto2.y, this.punto3.y};
        canvas.setColor(this.colorRelleno);
        canvas.fillPolygon(posicionesX, posicionesY, 3);
        canvas.setStroke(new BasicStroke(this.tamañoBorde));
        canvas.setColor(this.colorBorde);
        canvas.drawPolygon(posicionesX, posicionesY, 3);
        canvas.fillOval(0, 0, 0, 0);
    }

    @Override
    public float getArea() {
        return 0;
    }
}
