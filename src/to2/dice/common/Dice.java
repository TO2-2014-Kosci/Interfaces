package to2.dice.common;

public class Dice {
    private int[] dice;

    public Dice(){
        //Pewnie wrzuce tutaj konstruktor z tablicy int[5], bo bedzie generowane z jakiegos rand algo
        dice = new int[5];
    }

    public int[] getValue(){
        return dice;
    }
}