package to2.dice.common;

import java.util.Map;

public class GameSettings {
    private GameType gameType;
    private String name;
    private int maxHumanPlayers;
    private int timeForMove;
    private int maxInactiveTurns;
    private int roundsToWin;
    private Map<BotLevel, Integer> botsNumber;

    public GameSettings(GameType gameType, String name, int maxHumanPlayers, int timeForMove, int maxInactiveTurns, int roundsToWin, Map<BotLevel, Integer> botsNumber) {
        this.gameType = gameType;
        this.name = name;
        this.maxHumanPlayers = maxHumanPlayers;
        this.timeForMove = timeForMove;
        this.maxInactiveTurns = maxInactiveTurns;
        this.roundsToWin = roundsToWin;
        this.botsNumber = botsNumber;
    }

    public GameType getGameType() {
        return gameType;
    }

    public String getName() {
        return name;
    }

    public int getMaxHumanPlayers() {
        return maxHumanPlayers;
    }

    public int getTimeForMove() {
        return timeForMove;
    }

    public int getMaxInactiveTurns() {
        return maxInactiveTurns;
    }

    public int getRoundsToWin() {
        return roundsToWin;
    }

    public Map<BotLevel, Integer> getBotsNumber() {
        return botsNumber;
    }
}
