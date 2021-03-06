package org.gruppe2.game.event;

import org.gruppe2.game.Player;
import org.gruppe2.game.RoundPlayer;

public class PlayerPreActionEvent implements Event {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6697919760037783069L;
	private final Player player;
    private final RoundPlayer roundPlayer;

    public PlayerPreActionEvent(Player player, RoundPlayer roundPlayer) {
        this.player = player;
        this.roundPlayer = roundPlayer;
    }

    public Player getPlayer() {
        return player;
    }

    public RoundPlayer getRoundPlayer() {
        return roundPlayer;
    }
}
