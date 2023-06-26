package com.devonpouw.PlayersGuide.Day23;

public class PointMain {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        Point point2 = new Point(-4, 0);
        System.out.printf("(%s, %s)", point.getX(), point.getY());
        System.out.printf("(%s, %s)", point2.getX(), point2.getY());
    }
}
