package com.palmaactiva.intro_programacion.modulo2.figuras.formas;

import com.palmaactiva.intro_programacion.modulo2.figuras.FiguraConBorde;
import com.palmaactiva.intro_programacion.modulo2.figuras.utiles.UtilesFiguras;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Linea extends FiguraConBorde {

    public Linea(Point p1, Point p2, Color colorBorde, float tamañoBorde) {
        this.puntos = new Point[]{p1, p2};
        this.colorBorde = colorBorde;
        this.tamañoBorde = tamañoBorde;
    }

    public Linea(Point p1, Point p2) {
        this(p1, p2, null, 0);
        this.colorBorde = UtilesFiguras.getColorAleatorio();
        this.tamañoBorde = UtilesFiguras.getTamañoAleatorio();
    }

    @Override
    public void pintar(Graphics2D canvas) {
        canvas.setColor(this.colorBorde);
        canvas.setStroke(new BasicStroke(this.tamañoBorde));
        canvas.drawLine(this.puntos[0].x, this.puntos[0].y, this.puntos[1].x, this.puntos[1].y);
    }
}
