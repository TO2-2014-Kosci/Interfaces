package to2.dice.gamecontroller;

import to2.dice.common.GameSettings;
import to2.dice.common.GameType;
import to2.dice.server.GameServer;

public class GameControllerFactory {
    public GameController createGameControler(GameServer server, GameSettings settings){
        GameController gameController = null;
        GameType type = settings.getGameType();
        switch (type){
            case NPLUS:
                gameController = new NGameController(server, new PlusCountingStrategy());
                break;
            case NMULTIPLY:
                gameController = new NGameController(server, new MulCountingStrategy());
                break;
            case POKER:
                gameController = new PokerGameController(server);
                break;
            default:
                //THROW SOMETHING HERE
                break;
        }
        return gameController;
    }
}
