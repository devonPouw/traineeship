package com.devonpouw.PlayersGuide;

import java.util.Scanner;

public class Day10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input x coordinate:");
        int x = scanner.nextInt();
        System.out.println("Please input y coordinate:");
        int y = scanner.nextInt();
        System.out.println("The enemy is " + Coordinates(x, y));
    }

    private static String Coordinates(int x, int y) {
        if ((y > 0) && (x > 0))
            return "to the NorthEast";
         else if ((y > 0) && (x < 0))
            return "to the NorthWest";
        else if((y < 0) && (x > 0))
           return "to the SouthEast";
         else if ((y == 0) && (x < 0))
           return "to the West";
        else if ((y == 0) && (x > 0))
            return "to the East";
        else if ((y < 0) && (x == 0))
            return "to the South";
        else if ((y > 0) && (x == 0))
            return "to the North";
        else if ((y < 0) && (x < 0))
            return "to the SouthWest";
         else if ((y == 0) && (x == 0))
          return "Here!";
        return "missing";
    }
}