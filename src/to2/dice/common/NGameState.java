package to2.dice.common;

public class NGameState extends GameState {
    private int winningNumber;

    public int getWinningNumber() {
        return winningNumber;
    }

    public void setWinningNumber(int winningNumber) {
        this.winningNumber = winningNumber;
    }
}