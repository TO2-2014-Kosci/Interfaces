package to2.dice.gamecontroller;

import to2.dice.common.GameInfo;
import to2.dice.messaging.GameAction;
import to2.dice.server.GameServer;

public abstract class GameController {
    private GameServer server;
    private GameInfo gameInfo;

    public GameController(GameServer server) {
        this.server = server;
    }

    public abstract void handleGameAction(GameAction action);

    public GameInfo getGameInfo(){ return gameInfo; }
}