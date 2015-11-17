/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobuscaminas;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Arbay Fernández, Áaron Jara Molina
 *
 */
public class Menú {

    private int opc = 0;
    Scanner leer = new Scanner(System.in);

    public void Elección() {
        opc = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Juego \n 1-Para Jugar \n 2-Salir"));
        menúOpciones();
    }

    public void menúOpciones() {
        switch (opc) {
            case 1:
                System.out.println("hola");
                break;
            case 2:
                System.exit(0);
                break;
            default:

        }
    }
}
