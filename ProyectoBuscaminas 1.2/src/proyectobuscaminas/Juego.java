/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobuscaminas;//Paquete al que pertenece la clase

/**
 *
 * @author Arbay Fernández Solano, Aaron Jara Molina
 **/
public class Juego extends Object{
    int tablero [][]; // Matriz de tipo entero
    int fila;// Variable de tipo entero llamada fila
    int columna;// Variable de tipo entero llamada columna
    //Método Constructor
    public Juego(int[][] tablero, int fila, int columna) {
        this.tablero = tablero;
        this.fila = fila;
        this.columna = columna;
    }
     /**
     * Metodo get para variable:
     * @return    
     **/
    public int[][] getTablero() {
        return this.tablero;
    }
    /**
     * Metodo set para variable:
     * @param tablero     
     **/
    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }
     /**
     * Metodo get para variable:
     * @return 
     **/
    public int getFila() {
        return this.fila;
    }
     /**
     * Metodo set para variable:
     * @param fila    
     **/
    public void setFila(int fila) {
        this.fila = fila;
    }
    /**
     * Metodo get para variable:
     * @return columna
     **/
    public int getColumna() {
        return this.columna;
    }
     /**
     * Metodo set para variable:
     * @param columna
     **/
    public void setColumna(int columna) {
        this.columna = columna;
    }
   
    
}
