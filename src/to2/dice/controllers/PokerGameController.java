package to2.dice.controllers;

import to2.dice.game.GameInfo;
import to2.dice.game.GameSettings;
import to2.dice.messaging.GameAction;
import to2.dice.messaging.Response;
import to2.dice.server.GameServer;

public class PokerGameController extends GameController {

    public PokerGameController(GameServer server, GameSettings settings){
        super(server, settings);
    }

    @Override
    public Response handleGameAction(GameAction action) {
        return null;
    }

    @Override
    public GameInfo getGameInfo() {
        return null;
    }
}
