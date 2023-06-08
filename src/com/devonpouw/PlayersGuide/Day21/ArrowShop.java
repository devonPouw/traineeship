package com.devonpouw.PlayersGuide.Day21;

public class ArrowShop {
    private Arrow.ArrowHead arrowHead;
    private Arrow.Fletchling fletchling;

    public ArrowShop(Arrow.ArrowHead arrowHead, Arrow.Fletchling fletchling) {
        this.arrowHead = arrowHead;
        this.fletchling = fletchling;
    }

    public Arrow.ArrowHead getArrowHead() {
        return arrowHead;
    }

    public void setArrowHead(Arrow.ArrowHead arrowHead) {
        this.arrowHead = arrowHead;
    }

    public Arrow.Fletchling getFletchling() {
        return fletchling;
    }

    public void setFletchling(Arrow.Fletchling fletchling) {
        this.fletchling = fletchling;
    }

    public static void makeArrow() {

    }
}
