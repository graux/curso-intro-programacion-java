package com.palmaactiva.intro_programacion.modulo2.juego_vida.basico;

import java.awt.Color;

import javax.swing.JFrame;

public class JuegoVidaBasico extends JFrame {

    private AreaCelulas areaCelulas;

    private JuegoVidaBasico() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setTitle("Juego de la Vida Java - SIMPLE");
        this.getContentPane().setBackground(Color.WHITE);
        this.areaCelulas = new AreaCelulas(50, 40);
        this.add(areaCelulas);
    }

    public static void main(String[] args) {
        JuegoVidaBasico miApp = new JuegoVidaBasico();
        miApp.setVisible(true);
    }
}
