package com.devonpouw.PlayersGuide.Day21;

import java.util.Scanner;

public class ArrowShop {
    private final Arrow.ArrowHead arrowHead;
    private final Arrow.Fletchling fletchling;

    private int shaft;

    public ArrowShop(Arrow.ArrowHead arrowHead, Arrow.Fletchling fletchling) {
        this.arrowHead = arrowHead;
        this.fletchling = fletchling;
    }

    private Arrow createArrow(Arrow.Fletchling fletchling, Arrow.ArrowHead arrowHead, int shaft) {
        Scanner sc = new Scanner(System.in);

        return null;
    }

    public Arrow.ArrowHead getArrowHead() {
        return arrowHead;
    }

    public Arrow.Fletchling getFletchling() {
        return fletchling;
    }

    public void setShaft(int shaft) {
        this.shaft = shaft;
    }

    public int getShaft() {
        return shaft;
    }

}
