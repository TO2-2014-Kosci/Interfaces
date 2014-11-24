package to2.dice.controllers;

import to2.dice.game.GameSettings;
import to2.dice.game.GameType;
import to2.dice.controllers.ngames.MulCountingStrategy;
import to2.dice.controllers.ngames.PlusCountingStrategy;
import to2.dice.server.GameServer;

public class GameControllerFactory {
    public GameController createGameControler(GameServer server, GameSettings settings){
        GameController gameController = null;
        GameType type = settings.getGameType();
        switch (type){
            case NPLUS:
                gameController = new NGameController(server, settings, new PlusCountingStrategy());
                break;
            case NMUL:
                gameController = new NGameController(server, settings, new MulCountingStrategy());
                break;
            case POKER:
                gameController = new PokerGameController(server, settings);
                break;
            default:
                //THROW SOMETHING HERE
                break;
        }
        return gameController;
    }
}
