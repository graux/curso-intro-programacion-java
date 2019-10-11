package com.palmaactiva.intro_programacion.modulo2.figuras;

import java.awt.Color;

import javax.swing.JFrame;

public class AppFiguras extends JFrame {

    private AreaFiguras areaFiguras;

    private AppFiguras() {
        this.initJFrame();
    }

    private void initJFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setTitle("Figuras Programación Java");
        this.getContentPane().setBackground(Color.WHITE);
        this.areaFiguras = new AreaFiguras();
        this.add(this.areaFiguras);
    }

    public static void main(String[] args) {
        AppFiguras miApp = new AppFiguras();
        miApp.setVisible(true);
        miApp.areaFiguras.crearFiguras();
    }
}
