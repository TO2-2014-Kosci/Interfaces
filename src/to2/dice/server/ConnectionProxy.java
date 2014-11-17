package to2.dice.server;

import to2.dice.common.*;
import to2.dice.messaging.Response;

import java.util.List;

/**
 * Created by Fan on 2014-11-17.
 */
public abstract class ConnectionProxy {

    public ConnectionProxy(Object serverLink, ServerMessageListener listener) {
        this.addServerMessageListener(listener);
        this.connect(serverLink);
    }

    public abstract Response login(String login);

    public abstract List<GameInfo> getRoomList();

    public abstract Response createGameRoom(GameSettings settings, String login);

    public abstract Response leaveRoom(String login);

    public abstract Response sitDown(String login);

    public abstract Response standUp(String login);

    public abstract GameState reroll(Dice dice);

    protected abstract boolean connect(Object serverLink);

    public abstract void addServerMessageListener(ServerMessageListener listener);
}
