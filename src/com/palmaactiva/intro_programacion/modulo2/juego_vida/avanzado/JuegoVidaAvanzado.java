package com.palmaactiva.intro_programacion.modulo2.juego_vida.avanzado;

import java.awt.Color;

import javax.swing.JFrame;

public class JuegoVidaAvanzado extends JFrame {

    private AreaCelulas areaCelulas;

    private JuegoVidaAvanzado() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setTitle("Juego de la Vida Java - AVANZADO");
        this.getContentPane().setBackground(Color.WHITE);
        this.areaCelulas = new AreaCelulas(160, 120);
        this.add(areaCelulas);
    }

    public static void main(String[] args) {
        JuegoVidaAvanzado miApp = new JuegoVidaAvanzado();
        miApp.setVisible(true);
    }

    // Inicialización: 4ms
    // Tiempo Ciclo: 748,091ns
}