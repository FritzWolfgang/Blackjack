package de.waft.logic;

import de.waft.core.Deck;

public class Player {

    Hand hand;
    Deck deck;
    String name;
    boolean dealer;

    public Player(String playerName, Deck deck, boolean dealer) {
        hand = new Hand();
        this.deck = deck;
        this.name = playerName;
        this.dealer = dealer;
        restartGame();
    }

    public void restartGame() {
        hand.deleteCards();
        hand.addCard(deck.pickRandomCard());
        if(!dealer){
            hand.addCard(deck.pickRandomCard());
        }

    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }
}
