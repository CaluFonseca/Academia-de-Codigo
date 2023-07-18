import java.util.Random;

public class Player {

    private String name;


    public Player(String name) {
        this.name = name;
    }

    public String getName() {return this.name;}

    public Hand chooseHand() {

        int randomNumber = (int)(Math.random()* 3);
        Hand[] choices = Hand.values();

        Hand hand = choices[randomNumber];

        return hand;

    }
}
