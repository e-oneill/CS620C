package Week_3;
import java.lang.Math.*;
import java.util.*;
public class Dice {
    // Attributes
    int numOfSides;
    int faceValue;
    //Default Constructor
    public Dice()
    {
        this.numOfSides = 6;
        Random rand = new Random();
        this.faceValue = rand.nextInt(numOfSides+1);
    }
    //General Constructor
    public Dice (int numOfSides, int faceValue)
    {
        this.numOfSides = numOfSides;
        this.faceValue = faceValue;
    }

    //getSides
    public int getNumOfSides()
    {
        return this.numOfSides;
    }

    //getFaceValue
    public int getFaceValue()
    {
        return this.faceValue;
    }

    //setSides
    public void setNumOfSides(int numOfSides)
    {
        this.numOfSides = numOfSides;
    }
    

    //rollDice
    public int rollDice()
    {
        Random rand = new Random();
        this.faceValue = rand.nextInt(numOfSides+1);
        return this.faceValue;
    }
}
