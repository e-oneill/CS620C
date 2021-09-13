package Week_3;

public class Game {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice(6, 2);

        int sides = dice1.getNumOfSides();
        int faceValue = dice2.getFaceValue();

        dice2.setNumOfSides(20);
        dice2.rollDice();

        dice1.rollDice();
    }
}
