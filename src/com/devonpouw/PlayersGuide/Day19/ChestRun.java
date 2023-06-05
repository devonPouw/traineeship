package com.devonpouw.PlayersGuide.Day19;

import java.util.Scanner;

public class ChestRun {
    public static void main(String[] args) {
        switchingStates();
    }

    public static void switchingStates() {
        Scanner sc = new Scanner(System.in);
        var newChest = new Day19Chest(ChestStates.LOCKED);
        String input;
        System.out.println("Welcome to this chest. It can open, close, unlock and lock\n");
        do {
            System.out.println("What would you like to do? (quit to stop)");
            System.out.println("Chest is currently: " + newChest.getStatus());
            input = sc.next();
            newChest.setStatus(input);
        } while (!input.equalsIgnoreCase("quit"));
    }
}
