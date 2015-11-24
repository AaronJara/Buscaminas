/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobuscaminas;

/**
 *
 * @author Arbay Fernández Solano, Aaron Jara Molina
 **/
public class Juego extends Object{
    int tablero [][];
    int fila;
    int columna;

    public Juego(int[][] tablero, int fila, int columna) {
        this.tablero = tablero;
        this.fila = fila;
        this.columna = columna;
    }

    public int[][] getTablero() {
        return this.tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public int getFila() {
        return this.fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return this.columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
   
    
}
