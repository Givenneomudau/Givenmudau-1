/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissorsgame;

import java.util.Random;

/**
 *
 * @author RC_Student_lab
 */
public class ComputerPlayer extends Player{
  
    private Random random;
//
    public ComputerPlayer(String name) {
        super(name);
        this.random = new Random();
    }

    @Override
    
    // this method allows the you to make a move between paper, rock, scissors
    public String makeMove() {
        String[] moves = {"rock", "paper", "scissors"};
        return moves[random.nextInt(moves.length)];
    }
}
