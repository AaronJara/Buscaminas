/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminasgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arbay Fernández Solano, Aaron Jara Molina
 **/
public final class Tablero {

    private final int[][] mines;
    private final char[][] boardgame;
    private int Line, Column;
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    
    public Tablero (){
        mines = new int[10][10];
        boardgame = new char[10][10];
        startMines();
        randomMines();
        fillTips();
        startBoard(); 
    }
    
    public boolean win(){
        int count=0;
        for(int line = 1 ; line < 9 ; line++)
            for(int column = 1 ; column < 9 ; column++)
                if(boardgame[line][column]=='_')
                    count++;
        return count == 10;                
    }
    
    public void openNeighbors(){
        for(int i=-1 ; i<2 ; i++)
            for(int j=-1 ; j<2 ; j++)
                if( (mines[Line+i][Column+j] != -1) && (Line != 0 && Line != 9 && Column != 0 && Column != 9) )
                    boardgame[Line+i][Column+j]=Character.forDigit(mines[Line+i][Column+j], 10);
        
    }
    
    public int getPosition(int Line, int Column){
        return mines[Line][Column];
    }
    
    public boolean setPosition(){
            
            do{
                System.out.print("\nLinea: "); 
                Line = input.nextInt();
                System.out.print("Columna: "); 
                Column = input.nextInt();
                
                if( (boardgame[Line][Column] != '_') && ((Line < 9 && Line > 0) && (Column < 9 && Column > 0)))
                    System.out.println("Este espacio ya a sido ocupado");
                
                if( Line < 1 || Line > 8 || Column < 1 || Column > 8)
                    System.out.println("Choose a number between 1 and 8");
                
            }while((Line < 1 || Line > 8 || Column < 1 || Column > 8) || (boardgame[Line][Column] != '_') );
            
        return getPosition(Line, Column)== -1;
            
    }
    
    public void show(){
        System.out.println("\n     Lineas");
        for(int linea = 8 ; linea > 0 ; linea--){
            System.out.print("       "+linea + " ");
            
            for(int columna = 1 ; columna < 9 ; columna++){
                    System.out.print("   "+ boardgame[linea][columna]);
            }
                
            System.out.println();
        }
            
        System.out.println("\n            1   2   3   4   5   6   7   8");
        System.out.println("                      Columnas");
        
    }
    
    public void fillTips(){
        for(int line=1 ; line < 9 ; line++)
            for(int column=1 ; column < 9 ; column++){
                
                    for(int i=-1 ; i<=1 ; i++)
                        for(int j=-1 ; j<=1 ; j++)
                            if(mines[line][column] != -1)
                                if(mines[line+i][column+j] == -1)
                                    mines[line][column]++;
                
            }
            
    }
    
    public void showMines(){
        for(int i=1 ; i < 9; i++)
            for(int j=1 ; j < 9 ; j++)
                if(mines[i][j] == -1)
                    boardgame[i][j]='*';
        
        show();
    }
    
    public void startBoard(){
        for(int i=1 ; i<mines.length ; i++)
            for(int j=1 ; j<mines.length ; j++)
                boardgame[i][j]= '_';
    }
    
    public void startMines(){
        for (int[] mine : mines) {
            for (int j = 0; j<mines.length; j++) {
                mine[j] = 0;
            }
        }
    }
    
    public void randomMines(){
        boolean raffled;
        int linea, columna;
        for(int i=0 ; i<10 ; i++){
            
            do{
                linea = random.nextInt(8) + 1;
                columna = random.nextInt(8) + 1;
                
                raffled = mines[linea][columna] == -1;
            }while(raffled);
            
            mines[linea][columna] = -1;
        }
    }
   
}
