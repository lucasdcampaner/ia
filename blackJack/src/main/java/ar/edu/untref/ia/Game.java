package ar.edu.untref.ia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gonzalocozzi on 07/06/17.
 */
public class Game {

    private boolean isTerminal;
    private Player player;
    private Player croupier;
    private List<Player> playersList;
    private Deck deck;

    public Game() {
        this.isTerminal = false;
        this.player = new Player();
        this.croupier = new Player();
        this.deck = new Deck();
        this.playersList = new ArrayList<>();
        this.fillPlayersList();
    }

    private void fillPlayersList() {
        this.playersList.add(this.player);
        this.playersList.add(this.croupier);
    }

    protected boolean isTerminal() {
        return this.isTerminal;
    }

    protected Player getPlayer() {
        return this.player;
    }

    protected Player getCroupier() {
        return this.croupier;
    }

    protected List<Player> getPlayersList() {
        return this.playersList;
    }

    protected Deck getDeck() {
        return this.deck;
    }
}