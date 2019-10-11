package com.palmaactiva.intro_programacion.modulo2.figuras;

import com.palmaactiva.intro_programacion.modulo2.figuras.formas.Cuadrado;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

public class AreaFiguras extends JComponent implements Actualizable {

    private final FabricaFiguras fabricaFiguras;
    private List<Point> puntosPantalla;

    public AreaFiguras() {
        this.fabricaFiguras = new FabricaFiguras(this);
        this.puntosPantalla = new ArrayList<>();
        this.initEventListeners();
    }

    private void initEventListeners() {
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getButton() == 1) {
                    fabricaFiguras.crearFiguraAleatoria();
                } else {
                    AreaFiguras.this.puntosPantalla.add(e.getPoint());
                    System.out.println(e.getPoint());

                    if (AreaFiguras.this.puntosPantalla.size() == 2) {
                        Point p1 = AreaFiguras.this.puntosPantalla.get(0);
                        Point p2 = AreaFiguras.this.puntosPantalla.get(1);
                        fabricaFiguras.addFigura(new Cuadrado(p1, p2));
                        AreaFiguras.this.puntosPantalla.clear();
                    }
                }
            }
        });
    }

    public void crearFiguras() {
        this.fabricaFiguras.crearLinea();
        this.fabricaFiguras.crearLinea();
        this.fabricaFiguras.crearLinea();
        this.fabricaFiguras.crearCuadrado();
        this.fabricaFiguras.crearCuadrado();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        fabricaFiguras.pintarFiguras(g);
    }

    @Override
    public void actualizar() {
        this.repaint();
    }
}
