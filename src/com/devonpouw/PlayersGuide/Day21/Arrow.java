package com.devonpouw.PlayersGuide.Day21;

public class Arrow {

    public static Arrow createEliteArrow() {
        return new Arrow(ArrowHead.STEEL, Fletchling.PLASTIC, 95);
    }

    public static Arrow createMarksmanArrow() {
        return new Arrow(ArrowHead.STEEL, Fletchling.GOOSE_FEATHERS, 65);
    }

    public static Arrow createBeginnerArrow() {
        return new Arrow(ArrowHead.WOOD, Fletchling.GOOSE_FEATHERS, 75);
    }

    private ArrowHead arrowhead;
    private Fletchling fletchling;
    private int length;
    

    private static final float SHAFT_PRICE = 0.05f;

    public Arrow(ArrowHead arrowhead, Fletchling fletchling, int length) {
        this.arrowhead = arrowhead;
        this.fletchling = fletchling;
        this.length = length;
    }

    public ArrowHead getArrowhead() {
        return arrowhead;
    }

    public void setArrowhead(ArrowHead arrowhead) {
        this.arrowhead = arrowhead;
    }

    public Fletchling getFletchling() {
        return fletchling;
    }

    public void setFletchling(Fletchling fletchling) {
        this.fletchling = fletchling;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length >= 60 && length <= 100) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Number must be between 60 and 100");
        }
    }

    public float getCost() {
        return arrowhead.getPrice() + fletchling.getPrice() + SHAFT_PRICE * length;
    }
}

enum ArrowHead {
    STEEL(10f),
    WOOD(3f),
    OBSIDIAN(5f);
    private final float price;

    ArrowHead(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}


enum Fletchling {
    PLASTIC(10),
    TURKEY_FEATHERS(5),
    GOOSE_FEATHERS(3);
    private final float price;

    Fletchling(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}