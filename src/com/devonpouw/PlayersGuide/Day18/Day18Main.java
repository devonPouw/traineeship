package com.devonpouw.PlayersGuide.Day18;

public class Day18Main {
    static int three = 3;
    static int five = 5;

    public static void main(String[] args) {
        System.out.println("Please help us destroy the Manticore!\n");
        int randomNum = (int) (Math.random() * 101);
        int round = 0;
        int manticore = 10;
        for (int i = 15; i != 0; i--) {
            round++;
            System.out.println("Status: " + "Round: " + round + " City: " + i + "/15 " + "Manticore: " + manticore + "/10");
            int returnVal = Day18.askForNumberInRange("Enter desired cannon range: ", 1, 100);
            if (returnVal < randomNum) {
                System.out.println("The round fell short of the manticore!");
            } else if (returnVal == randomNum) {
                if (i % three == 0 || i % five == 0) {
                    manticore--;
                    manticore--;
                    manticore--;
                } else if (i % five == 0 && i % three == 0) {
                    manticore--;
                    manticore--;
                    manticore--;
                    manticore--;
                    manticore--;
                    manticore--;
                    manticore--;
                    manticore--;
                    manticore--;
                    manticore--;
                } else {
                    manticore--;
                }
                System.out.println("That round was a direct hit!");
            } else {
                System.out.println("That round overshot the manticore!");
            }
            if (manticore <= 0) {
                System.out.println("The city is saved!");
                break;
            }
        }
    }
}
