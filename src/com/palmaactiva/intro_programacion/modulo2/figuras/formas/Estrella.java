package com.palmaactiva.intro_programacion.modulo2.figuras.formas;

import com.palmaactiva.intro_programacion.modulo2.figuras.Figura;
import com.palmaactiva.intro_programacion.modulo2.figuras.FiguraConArea;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Point;

public class Estrella extends FiguraConArea implements Figura {

    public Estrella(Point centro, int radioExterno, int radioInterno, int numeroPicos, int grados) throws ParametrosFiguraInvalidosException {
        if (numeroPicos < 5 || numeroPicos > 12) {
            throw new ParametrosFiguraInvalidosException("El número de picos debe estar entre 5 y 12");
        }
        if (radioExterno < radioInterno) {
            throw new ParametrosFiguraInvalidosException("El radio externo debe ser mayor que el radio interno");
        }

        int numPuntos = numeroPicos * 2; // x2 para generar los picos internos
        this.puntos = new Point[numPuntos];
        double incrementoGrados = 360 / numPuntos;
        double rads;
        double posX;
        double posY;
        int radio;
        for (int indice = 0; indice < numPuntos; indice++) {
            rads = (grados + (indice * incrementoGrados)) * Math.PI / 180;
            radio = indice % 2 == 0 ? radioExterno : radioInterno;
            posX = Math.sin(rads) * radio;
            posY = Math.cos(rads) * radio;
            this.puntos[indice] = new Point(centro.x + (int) posX, centro.y + (int) posY);
        }
    }

    @Override
    public void pintar(Graphics2D canvas) {
        int numPuntos = this.puntos.length;
        int[] posicionesX = new int[numPuntos];
        int[] posicionesY = new int[numPuntos];
        for (int indice = 0; indice < numPuntos; indice++) {
            posicionesX[indice] = this.puntos[indice].x;
            posicionesY[indice] = this.puntos[indice].y;
        }
        canvas.setColor(this.colorRelleno);
        canvas.fillPolygon(posicionesX, posicionesY, numPuntos);
        canvas.setStroke(new BasicStroke(this.tamañoBorde));
        canvas.setColor(this.colorBorde);
        canvas.drawPolygon(posicionesX, posicionesY, numPuntos);
        canvas.fillOval(0, 0, 0, 0);
    }

    @Override
    public float getArea() {
        return 0;
    }
}
