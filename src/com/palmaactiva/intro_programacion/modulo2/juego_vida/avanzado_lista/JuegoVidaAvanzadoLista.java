package com.palmaactiva.intro_programacion.modulo2.juego_vida.avanzado_lista;


import java.awt.Color;

import javax.swing.JFrame;

public class JuegoVidaAvanzadoLista extends JFrame {

    private AreaCelulas areaCelulas;

    private JuegoVidaAvanzadoLista() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setTitle("Juego de la Vida Java - AVANZADO LISTA");
        this.getContentPane().setBackground(Color.WHITE);
        this.areaCelulas = new AreaCelulas(160, 120);
        this.add(areaCelulas);
    }

    public static void main(String[] args) {
        JuegoVidaAvanzadoLista miApp = new JuegoVidaAvanzadoLista();
        miApp.setVisible(true);
    }

    // Inicialización: 1488ms
    // Tiempo Ciclo: 632,249ns
}