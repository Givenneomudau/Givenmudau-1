/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissorsgame;

/**
 *
 * @author mudau
 */
import java.util.Random;
import java.util.Scanner;

public abstract class Player {
    
  

    
    protected String name;
    protected int wins;

    public Player(String name) {
        this.name = name;
        this.wins = 0;
    }

        // this method allows the user to make a move if the human/ computer wins the game it increment by 1
    public abstract String makeMove();

    public void incrementWins() {
        this.wins++;
    }
    
    // this method gets the winner

    public int getWins() {
        return this.wins;
    }
    

    public Player(int wins) {
        this.wins = wins;
    }

    // this method gets the name
    
    String getName() {
        this.name = name;
        return name;
    }
}
    





