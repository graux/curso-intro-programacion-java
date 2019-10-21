package com.palmaactiva.intro_programacion.modulo2.juego_vida.normal;

import java.awt.Color;

import javax.swing.JFrame;

public class JuegoVidaNormal extends JFrame {

    private AreaCelulas areaCelulas;

    private JuegoVidaNormal() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setTitle("Juego de la Vida Java - NORMAL");
        this.getContentPane().setBackground(Color.WHITE);
        this.areaCelulas = new AreaCelulas(80, 60);
        this.add(areaCelulas);

    }

    public static void main(String[] args) {
        JuegoVidaNormal miApp = new JuegoVidaNormal();
        miApp.setVisible(true);
    }
}