package to2.dice.controllers;

import to2.dice.game.GameInfo;
import to2.dice.game.GameSettings;
import to2.dice.messaging.GameAction;
import to2.dice.messaging.Response;
import to2.dice.server.GameServer;

public abstract class GameController {
    private GameServer server;
    private GameSettings settings;

    public GameController(GameServer server, GameSettings settings) {
        this.server = server;
        this.settings = settings;
    }

    public abstract Response handleGameAction(GameAction action);

    public abstract GameInfo getGameInfo();
}