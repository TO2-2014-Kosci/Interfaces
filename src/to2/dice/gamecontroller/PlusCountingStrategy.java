package to2.dice.gamecontroller;

import to2.dice.common.Dice;

public class PlusCountingStrategy implements CountingStrategy {
    @Override
    public int countPoints(Dice dice) {
        int result = 0;
        for(int i: dice.getValue()){
            result += i;
        }
        return result;
    }
}
