/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rockpaperscissorsgame;

/**
 *
 * @author RC_Student_lab
 */
public class RockPaperScissorsGame {
    
    
    private Player player1;
    private Player player2;

    public RockPaperScissorsGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    // this method returns the move which is choosen by the human or Computer and Number of Rounds
    
    public void playGame(int numRounds) {
        for (int i = 0; i < numRounds; i++) {
            String move1 = player1.makeMove();
            String move2 = player2.makeMove();
            System.out.println(player1.getName() + " chose " + move1);
            System.out.println(player2.getName() + " chose " + move2);
            determineWinner(move1, move2);
            System.out.println();
        }
        System.out.println("Final score: " + player1.getName() + " " + player1.getWins() + ", " + player2.getName() + " " + player2.getWins());
    }
    
    
    // this method determines the winner if the human or computer won the game or its a draw game
    

    private void determineWinner(String move1, String move2) {
        if (move1.equals(move2)) {
            
            System.out.println("It's a tie!");
            
        } else if ((move1.equals("rock") && move2.equals("scissors")) ||
                   (move1.equals("paper") && move2.equals("rock")) ||
                   (move1.equals("scissors") && move2.equals("paper"))) {
            System.out.println(player1.getName() + " wins this round!");
            player1.incrementWins();
        } else {
            System.out.println(player2.getName() + " wins this round!");
            player2.incrementWins();
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        // this methods show only the results of game played by the human or computer which are five games
        
        HumanPlayer humanPlayer = new HumanPlayer("Human");
        ComputerPlayer computerPlayer = new ComputerPlayer("Computer");
        RockPaperScissorsGame game = new RockPaperScissorsGame(humanPlayer, computerPlayer);
        game.playGame(5);
    
    }
}
