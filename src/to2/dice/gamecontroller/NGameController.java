package to2.dice.gamecontroller;

import to2.dice.messaging.GameAction;
import to2.dice.server.GameServer;

public class NGameController extends GameController {
    private CountingStrategy strategy;

    public NGameController(GameServer server, CountingStrategy strategy){
        super(server);
        this.strategy = strategy;
    }
    @Override
    public void handleGameAction(GameAction action) {
        //DO SOMETHING HERE
    }
}
