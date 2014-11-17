package to2.dice.gamecontroller;

import to2.dice.common.GameInfo;

public abstract class GameController {
    private GameServer server;

    public GameController(GameServer server) {
        this.server = server;
    }

    public abstract void handleGameAction(GameAction action);

    public abstract GameInfo getGameInfo();
}
