package com.devonpouw.PlayersGuide.Day24;

public class Color {
    private final int r;
    private final int g;
    private final int b;

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    static final Color WHITE = new Color(255, 255, 255);
    static final Color black = new Color(0, 0, 0);
    static final Color red = new Color(255, 0, 0);
    static final Color orange = new Color(255, 165, 0);
    static final Color yellow = new Color(255, 255, 0);
    static final Color green = new Color(0, 128, 0);
    static final Color blue = new Color(0, 0, 255);
    static final Color purple = new Color(128, 0, 128);

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public static Color getWhite() {
        return WHITE;
    }

    public static Color getBlack() {
        return black;
    }

    public static Color getRed() {
        return red;
    }

    public static Color getOrange() {
        return orange;
    }

    public static Color getYellow() {
        return yellow;
    }

    public static Color getGreen() {
        return green;
    }

    public static Color getBlue() {
        return blue;
    }

    public static Color getPurple() {
        return purple;
    }
}
