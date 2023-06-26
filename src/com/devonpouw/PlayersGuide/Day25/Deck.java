package com.devonpouw.PlayersGuide.Day25;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();
        for (CardColor cardColor : CardColor.values()) {
            for (CardRank cardRank : CardRank.values()) {
                Card card = new Card(cardColor, cardRank);
                deck.add(card);
            }
        }
        for (Card card : deck) {
            card.printDetails();
        }
    }
}


