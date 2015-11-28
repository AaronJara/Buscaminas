/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminasgame;

import javax.swing.JOptionPane;

/**
 *
 * @author Arbay Fernández Solano, Aaron Jara Molina
 *
 */
public final class Game {

    private final Tablero board;
    boolean finish = false;
    boolean win = false;
    int turn = 0;

    public Game() {
        board = new Tablero();
        for (;;) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Juego \n Digite \n 1-Para Empezar a jugar \n 2-Para Salir"));
            switch (opcion) {
                case 1:
                    Play(board);
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:

            }
        }
    }

    public void Play(Tablero board) {
        do {
            turn++;
            System.out.println("Turno " + turn);
            board.show();
            finish = board.setPosition();

            if (!finish) {
                board.openNeighbors();
                finish = board.win();
            }

        } while (!finish);

        if (board.win()) {
            System.out.println("Felicidadez Has ganado en: " + turn + " turnos");
            board.showMines();
        } else {
            System.out.println("Has Perdido!");
            board.showMines();
        }
    }
}
