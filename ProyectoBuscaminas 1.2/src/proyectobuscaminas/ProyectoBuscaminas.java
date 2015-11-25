/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobuscaminas; //Paquete al que pertenece la clase

/**
 *
 * @author Arbay Fernández Solano, Aaron Jara Molina
 */
public class ProyectoBuscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fila = 0; //variable de tipo entero llamada fila
        int columna = 0;//variable de tipo entero llamada columna
        int tablero[][] = new int[fila][columna];//Matriz de tipo entero llamada tablero

        Menu m1 = new Menu();// Instancio mi clase Menu
        m1.Eleccion();//Llamo al metodo Elección()
        

    }

}
