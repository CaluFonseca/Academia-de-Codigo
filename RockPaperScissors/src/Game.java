import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {

    private Player player1;
    private Player player2;

    private Scanner userMessage;

    // Game constructor
    public Game() {
        userMessage = new Scanner(System.in);
    }

    // Method to star the game
    public void startGame() {

        welcomeMessage();
        gameLogic();
    }

    // Message and user input
    public void welcomeMessage() {

        System.out.println("Welcome to our Rock, Paper and Scissors game.\n" + "First player to win five games, Win the game!");

        System.out.println("\nPlayer 1, please enter your name: ");
        String user1 = userMessage.nextLine();

        System.out.println("Player 2, please enter your name: ");
        String user2 = userMessage.nextLine();

            player1 = new Player(user1);
            player2 = new Player(user2);

            System.out.println("Name not valid");

        }

    // Logic of the game
    public void gameLogic() {

        int rounds = 0;
        for (int i = 0; i < 5; i++) {
            Hand firstHand = player1.chooseHand();
            Hand secondHand = player2.chooseHand();
            System.out.println("\n" + player1.getName() + " choose: " + player1.chooseHand());
            System.out.println(player2.getName() + " choose: " + player2.chooseHand() + "\n");
            rounds++;

            if (firstHand == Hand.ROCK && secondHand == Hand.ROCK) {
                System.out.println("This was a tie!");
            } else if (firstHand == Hand.PAPER && secondHand == Hand.PAPER) {
                System.out.println("This was a tie!");
            } else if (firstHand == Hand.SCISSORS && secondHand == Hand.SCISSORS) {
                System.out.println("This was a tie!");
            }

            if (firstHand == Hand.ROCK && secondHand == Hand.SCISSORS) {
                System.out.println("Amazing game " + player1.getName() + ", you won!");
            } else if (firstHand == Hand.ROCK && secondHand == Hand.PAPER) {
                System.out.println("Amazing game " + player2.getName() + ", you won!");
            }

            if (firstHand == Hand.PAPER && secondHand == Hand.ROCK) {
                System.out.println("Amazing game " + player1.getName() + ", you won!");
            } else if (firstHand == Hand.PAPER && secondHand == Hand.SCISSORS) {
                System.out.println("Amazing game " + player2.getName() + ", you won!");
            }
            if (firstHand == Hand.SCISSORS && secondHand == Hand.ROCK) {
                System.out.println("Amazing game " + player2.getName() + ", you won!");
            } else if (firstHand == Hand.SCISSORS && secondHand == Hand.PAPER) {
                System.out.println("Amazing game " + player1.getName() + ", you won!");
            }
            System.out.println("Rond number " + rounds);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }

    }
}
