package com.devonpouw.PlayersGuide.BeforeDay18;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my outfitter shop.");
        System.out.println("Would you like to purchase anything?\nYes/No:");
        String input = scanner.next();
        boolean b = input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
        if (b) {
            System.out.println("Here is a view of all the available items:");
            System.out.println("------------------------------------------");
            System.out.println("   1. Rope");
            System.out.println("   2. Torches");
            System.out.println("   3. Climbing equipment");
            System.out.println("   4. Clean water");
            System.out.println("   5. Machete");
            System.out.println("   6. Canoe");
            System.out.println("   7. Food supplies");
            System.out.println("------------------------------------------");
        } else {
            return;
        }
        System.out.println("What is your name?");
        String name = scanner.next();
        boolean myName = name.equalsIgnoreCase("Devon");
        if (myName) {
            System.out.println("Because your name equals mine the shop is 50% off!");
            System.out.println("Enter the number of an item to see the price:");
            int inputShopDiscount = scanner.nextInt();
            switch (inputShopDiscount) {
                case 1:
                    System.out.println("Rope ----> 5 gold");
                    break;
                case 2:
                    System.out.println("Torches ----> 7.5 gold");
                    break;
                case 3:
                    System.out.println("Climbing equipment ----> 12.5 gold");
                    break;
                case 4:
                    System.out.println("Clean water ----> 0.5 gold");
                    break;
                case 5:
                    System.out.println("Machete ----> 10 gold");
                    break;
                case 6:
                    System.out.println("Canoe ----> 100 gold");
                    break;
                case 7:
                    System.out.println("Food supplies ----> 0.5 gold");
                    break;
            }
        } else {
            System.out.println("Enter the number of an item to see the price:");
            int inputShop = scanner.nextInt();
            switch (inputShop) {
                case 1:
                    System.out.println("Rope ----> 10 gold");
                    break;
                case 2:
                    System.out.println("Torches ----> 15 gold");
                    break;
                case 3:
                    System.out.println("Climbing equipment ----> 25 gold");
                    break;
                case 4:
                    System.out.println("Clean water ----> 1 gold");
                    break;
                case 5:
                    System.out.println("Machete ----> 20 gold");
                    break;
                case 6:
                    System.out.println("Canoe ----> 200 gold");
                    break;
                case 7:
                    System.out.println("Food supplies ----> 1 gold");
                    break;
            }
        }
    }
}
