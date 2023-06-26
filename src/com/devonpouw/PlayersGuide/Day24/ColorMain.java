package com.devonpouw.PlayersGuide.Day24;

public class ColorMain {
    public static void main(String[] args) {
        Color azure = new Color(0, 128, 255);
        Color red = Color.red;
        System.out.printf("Red(%s, %s, %s) Azure(%s, %s, %s)", red.getR(), red.getG(), red.getB(), azure.getR(), azure.getG(), azure.getB());
    }
}
