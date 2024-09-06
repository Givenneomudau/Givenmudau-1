/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissorsgame;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class HumanPlayer extends Player{
    
    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        this.scanner = new Scanner(System.in);
    }

    @Override
    
        // this method allows the you to make a move between paper, rock, scissors
    
    public String makeMove() {
        System.out.print("Enter your move (rock, paper, or scissors): ");
        String move = scanner.nextLine().trim().toLowerCase();
        while (!isValidMove(move)) {
            System.out.print("Invalid move. Enter your move (rock, paper, or scissors): ");
            move = scanner.nextLine().trim().toLowerCase();
        }
        return move;
    }

    
        // this method shows the move which is available to choose  between paper, rock, scissors
    
    private boolean isValidMove(String move) {
        String[] validMoves = {"rock", "paper", "scissors"};
        for (String validMove : validMoves) {
            if (move.equals(validMove)) {
                return true;
            }
        }
        return false;
    }
}

    

