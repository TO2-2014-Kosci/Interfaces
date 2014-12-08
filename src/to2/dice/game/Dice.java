package to2.dice.game;

public class Dice {
    private int diceNumber;
    private int[] dice;

    public Dice(int diceNumber){
        this.diceNumber = diceNumber;
        dice = new int[diceNumber];
    }

    public int[] getValues(){
        return dice;
    }

    public void setValues(int[] dice) {
        this.dice = dice;
    }
}