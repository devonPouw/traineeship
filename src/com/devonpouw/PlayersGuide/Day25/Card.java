package com.devonpouw.PlayersGuide.Day25;


enum CardColor {
    RED("red"),
    GREEN("green"),
    BLUE("blue"),
    YELLOW("yellow");
    private final String color;

    CardColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

enum CardRank {
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    DOLLAR("$"),
    PERCENT("%"),
    CIRCUMFLEX("^"),
    AMPERSAND("&");
    private final String rank;

    CardRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}

public class Card {
    private final CardColor cardColor;
    private final CardRank cardRank;

    public Card(CardColor cardColor, CardRank cardRank) {
        this.cardColor = cardColor;
        this.cardRank = cardRank;
    }

    private String symbolChecker() {

        if (cardRank.ordinal() >= 10) {
            return "(special card)";
        }
        return "(numbered card)";
    }

    public void printDetails() {
        System.out.printf("THE %s %s %s\n", cardColor, cardRank, symbolChecker());
    }

}