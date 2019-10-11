package com.palmaactiva.intro_programacion.modulo2.figuras.formas;

import com.palmaactiva.intro_programacion.modulo2.figuras.FiguraConArea;
import com.palmaactiva.intro_programacion.modulo2.figuras.utiles.UtilesFiguras;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Point;

public class Cuadrado extends FiguraConArea {

    private Point puntoInicio;
    private Point puntoFin;

    public Cuadrado(Point p1, Point p2) {
        this.puntos = new Point[]{p1, p2};
        this.colorBorde = UtilesFiguras.getColorAleatorio();
        this.colorRelleno = UtilesFiguras.getColorAleatorio();
        this.puntoInicio = this.getPuntoInicio();
        this.puntoFin = this.getPuntoFin();
    }

    private Point getPuntoInicio() {
        int p1X = this.puntos[0].x;
        int p2X = this.puntos[1].x;
        int p1Y = this.puntos[0].y;
        int p2Y = this.puntos[1].y;
        return new Point(Math.min(p1X, p2X), Math.min(p1Y, p2Y));
    }

    private Point getPuntoFin() {
        int p1X = this.puntos[0].x;
        int p2X = this.puntos[1].x;
        int p1Y = this.puntos[0].y;
        int p2Y = this.puntos[1].y;
        return new Point(Math.max(p1X, p2X), Math.max(p1Y, p2Y));
    }

    public int getAncho() {
        return this.puntoFin.x - this.puntoInicio.x;
    }

    public int getAlto() {
        return this.puntoFin.y - this.puntoInicio.y;
    }

    @Override
    public void pintar(Graphics2D canvas) {
        canvas.setColor(this.colorRelleno);
        canvas.fillRect(this.puntoInicio.x, this.puntoInicio.y, this.getAncho(), this.getAlto());
        canvas.setStroke(new BasicStroke(this.tamañoBorde));
        canvas.setColor(this.colorBorde);
        canvas.drawRect(this.puntoInicio.x, this.puntoInicio.y, this.getAncho(), this.getAlto());
    }

    @Override
    public float getArea() {
        return 0;
    }
}
