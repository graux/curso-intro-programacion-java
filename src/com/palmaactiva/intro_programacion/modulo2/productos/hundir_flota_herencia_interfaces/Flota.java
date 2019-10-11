package com.palmaactiva.intro_programacion.modulo2.productos.hundir_flota_herencia_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Flota {

    private final List<Disparable> objetosTablero;
    private int disparosDisponibles = 30;
    public static final int NUM_FILAS = 9;
    public static final int NUM_COLUMNAS = 9;

    public Flota() {
        // Iniciamos las colecciones de barcos y de disparos al agua
        this.objetosTablero = new ArrayList<>();
        // Cremamos los barcos con un método
        this.crearBarco(5);
        this.crearBarco(4);
        this.crearBarco(2);
        this.crearBarco(2);
        this.crearBarco(2);

        this.anyadirAgua();
    }

    private void anyadirAgua() {
        Disparable dis;
        for (int iFilas = 0; iFilas < NUM_FILAS; iFilas++) {
            for (int iColumnas = 0; iColumnas < NUM_COLUMNAS; iColumnas++) {
                dis = this.getObjetoEnPosicion(new Posicion(iFilas, iColumnas));
                if (dis == null) {
                    this.objetosTablero.add(new Celda(iFilas, iColumnas));
                }
            }
        }
    }

    private Disparable getObjetoEnPosicion(Posicion pos) {
        for (Disparable dis : this.objetosTablero) {
            if (dis.seSolapaCon(pos)) {
                return dis;
            }
        }
        return null;
    }

    private void crearBarco(int numCeldas) {
        Barco nuevoBarco = null;
        do {
            // Creamos un barco nuevo
            nuevoBarco = new Barco(numCeldas);
            // Y para los barcos creados anteriormente...
            for (Posicionable barco : this.objetosTablero) {
                // Comprobamos si se solapan los dos barcos (el nuevo con el de bucle)
                if (barco.seSolapaCon(nuevoBarco)) {
                    // Si se solapan, descartamos el nuevo barco usando null y salimos del bucle
                    // (este barco no sirve, necesitamos otro)
                    nuevoBarco = null;
                    break;
                }
            }
            // Repetiremos esto mientras que nuevoBarco es null, es decir, mientras que el
            // nuevoBarco se solape con otro.
        } while (nuevoBarco == null);

        // Añado el nuevo barco a mi lista de barcos.
        this.objetosTablero.add(nuevoBarco);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // Mostramos los nombres de las columnas y una línea
        sb.append(" |a|b|c|d|e|f|g|h|i|\n");
        sb.append("--------------------\n");
        // Declaramos algunas variables para ver el estado de cada celda
        Posicion posicionActual;
        Dibujable posicionAPintar;
        // Recorremos todas las filas
        for (int indiceFila = 0; indiceFila < NUM_FILAS; indiceFila++) {
            // Mostramos el número de la fila: 1, 2, 3, 4
            sb.append((indiceFila + 1));
            // Recorremos las columnas de la fila actual
            for (int indiceColumna = 0; indiceColumna < NUM_COLUMNAS; indiceColumna++) {
                // Empezamos con una barra
                sb.append("|");
                // Crearmos una posición para la posición actual
                posicionActual = new Posicion(indiceFila, indiceColumna);
                // Por defecto pintaremos la posición, que es el texto vacío " ".
                posicionAPintar = this.getObjetoEnPosicion(posicionActual);
                // Pintamos la posición a pintar
                sb.append(posicionAPintar.getStringCelda(posicionActual));
            }
            // Ponemos una barra al final y cambiamos de línea \n
            sb.append("|\n");
        }
        // Dibujamos una línea final y la cantidad de disparos restantes.
        sb.append("--------------------\n");
        sb.append("Disparos Restantes: ").append(this.disparosDisponibles).append("\n");
        // Devolvemos la String resultante.
        return sb.toString();
    }

    public boolean puedeContinuar() {
        // Quedan disparos?
        if (this.disparosDisponibles > 0) {
            // Miramos todos los objetos del tablero
            Barco barco;
            for (Posicionable objTablero : this.objetosTablero) {
                // Buscamos sólo barcos
                if (objTablero instanceof Barco) {
                    // Si convertimos el objeto tablero en barco ahora que sabemos que es un barco
                    barco = (Barco) objTablero;
                    // si no está hundido...
                    if (!barco.estaHundido()) {
                        // Se puede continuar
                        return true;
                    }
                }
            }
        }
        // Si llega hasta aquí es que o no quedan barcos o no quedan disparos.
        return false;
    }

    public boolean esVictoria() {
        Barco barco;
        // Buscamos en todos los objetos
        for (Posicionable objTablero : this.objetosTablero) {
            // Solo en los barcos, no queremos los disparos
            if (objTablero instanceof Barco) {
                // Convertimos el objeto tablero en barco ahora que sabemos que es un barco
                barco = (Barco) objTablero;
                // Si no está hundido...
                if (!barco.estaHundido()) {
                    // El juego todavía no ha terminado
                    return false;
                }
            }
        }
        // Si todos los barcos se han hundido -> Victoria
        return true;
    }

    public void disparar(Disparo disparo) {
        // Decrementamos los disparos disponibles.
        this.disparosDisponibles--;
        // Buscamos el objeto que se encuentra en la posición
        Disparable objTablero = this.getObjetoEnPosicion(disparo);
        // Comprobamos que hay objeto por seguridad... debería siempre ser true
        if (objTablero != null) {
            // Disparamos al objeto    
            objTablero.disparar(disparo);
            // Y si es Barco...
            if (objTablero instanceof Barco) {
                if (((Barco) objTablero).estaHundido()) {
                    System.out.println("\n\n -> BARCO HUNDIDO !!\n\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        Flota juegoFlota = new Flota();
        Scanner teclado = new Scanner(System.in);
        Disparo disparo;
        do {
            // Mostramos el tablero/estado del juego
            System.out.println(juegoFlota);
            disparo = leerDisparo(teclado);
            // Se efectua el disparo
            juegoFlota.disparar(disparo);
            // Se continua mientras que el juego no termine
        } while (juegoFlota.puedeContinuar());

        if (juegoFlota.esVictoria()) {
            // Si se gana
            System.out.println("Felicidades has aniquilado la flota enemiga!");
        } else {
            // Si se pierde
            System.out.println("GAME OVER, no te quedan disparos!");
        }

        // Cerramos el teclado porque ya no lo vamos a usar más.
        teclado.close();
    }

    private static Disparo leerDisparo(Scanner teclado) {
        System.out.println("¿A qué posición quieres disparar?");
        Disparo disparo;
        try {
            // Utilizamos un método estático para crear disparos
            disparo = Disparo.parseDisparo(teclado.nextLine());
        } catch (NumberFormatException numberExcep) {
            // Si el disparo tiene error, mostramos el error
            System.out.println("Error: Introduce un número de Fila válido");
            // Y volvemos a intentarlo
            return leerDisparo(teclado);
        } catch (DisparoFormatException disparoExcep) {
            // Si el disparo tiene error, mostramos el error
            System.out.println("Error: La celda no existe");
            // Y volvemos a intentarlo
            return leerDisparo(teclado);
        }
        return disparo;
    }
}
