package to2.dice.gamecontroller;

import to2.dice.messaging.GameAction;
import to2.dice.server.GameServer;

public class PokerGameController extends GameController {

    public PokerGameController(GameServer server){
        super(server);
    }

    @Override
    public void handleGameAction(GameAction action) {
        //DO SOMETHING HERE
    }
}
