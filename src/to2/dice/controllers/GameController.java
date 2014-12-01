package to2.dice.controllers;

import to2.dice.game.GameInfo;
import to2.dice.game.GameSettings;
import to2.dice.game.GameState;
import to2.dice.messaging.GameAction;
import to2.dice.messaging.Response;
import to2.dice.server.GameServer;

public abstract class GameController {
    protected GameServer server;
    protected GameSettings settings;
    protected String creator;
    protected GameState state;

    public GameController(GameServer server, GameSettings settings, String creator) {
        this.server = server;
        this.settings = settings;
        this.creator = creator;
    }

    public GameInfo getGameInfo(){ return new GameInfo(settings, state); }

    public abstract Response handleGameAction(GameAction action);
}