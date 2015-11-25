/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobuscaminas;//Paquete al que pertenece la clase
//Importes de paquetes
import javax.swing.JOptionPane; 
import java.util.Scanner;

/**
 *
 * @author Arbay Fernández, Aaron Jara Molina
 *
 */
public class Menu {

    private int opc = 0; ////variable de tipo entero llamada opc
    Scanner leer = new Scanner(System.in); // Sccanner llamado leer

    public void Eleccion() { // Método para escoger las opciones del juego
        opc = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Juego \n 1-Para Jugar \n 2-Salir"));
        menuOpciones();//llamo al método menuOpciones
    }
    /**
    *Método llamado menuOpciones 
    *Permite seleccionar las opciones (Crea el menú del juego )
    **/
    public void menuOpciones() { 
        switch (opc) {
            case 1:
                
                break;
            case 2:
                System.exit(0);
                break;
            default:

        }
    }
}
