package com.devonpouw.PlayersGuide.Day18;

public class Day18Main {
    static int three = 3;
    static int five = 5;

    public static void main(String[] args) {
        System.out.println("Please help us destroy the Manticore!");
        int randomNum = (int) (Math.random() * 101);
        int round = 0;
        int manticore = 10;
        for (int city = 15; city != 0; city--) {
            round++;
            System.out.println("\nStatus: " + "Round: " + round + " City: " + city + "/15 " + "Manticore: " + manticore + "/10");
            if (city % three == 0 && city % five == 0) {
                System.out.println("Cannon is expected to deal 10 damage");
            } else if (round % five == 0 || round % three == 0) {
                System.out.println("Cannon is expected to deal 3 damage");
            } else {
                System.out.println("Cannon is expected to deal 1 damage");
            }
            int returnVal = Day18.askForNumberInRange("Enter desired cannon range: ", 1, 100);
            if (returnVal < randomNum) {
                System.out.println("The round fell short of the manticore!");
            } else if (returnVal == randomNum) {
                if (city % three == 0 && city % five == 0) {
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
                } else if (city % five == 0 || city % three == 0) {
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
