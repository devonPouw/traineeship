package com.devonpouw.PlayersGuide.Day21;

public class Arrow {

    private ArrowHead arrowhead;
    private Fletchling fletchling;
    private int length;
    private float cost;

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
        return cost;
    }
}

enum ArrowHead {
    STEEL(10),
    WOOD(3),
    OBSIDIAN(5);

    ArrowHead(int price) {
    }
}

enum Fletchling {
    PLASTIC(10),
    TURKEY_FEATHERS(5),
    GOOSE_FEATHERS(3);

    Fletchling(int price) {
    }
}