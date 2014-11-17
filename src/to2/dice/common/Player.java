package to2.dice.common;

public class Player {
    private String name;
    private int score = 0;
    private Dice dice = new Dice();
    private boolean isBot;

    public Player(String name, boolean isBot) {
        this.name = name;
        this.isBot = isBot;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Dice getDice() {
        return dice;
    }

    public boolean isBot() {
        return isBot;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }
}
