package com.devonpouw.PlayersGuide.BeforeDay18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day16 {
    public static int askForNumber(String text) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            try {
                System.out.print(text);
                input = sc.nextInt();
            } catch (InputMismatchException ex) {
                sc.next();
                continue;
            }
            return input;
        } while (true);
    }

    public static int askForNumberInRange(String text, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(text);
            try {
                num = sc.nextInt();
                if (num >= min && num <= max) {
                    valid = true;
                } else {
                    System.out.println("Out of range.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a valid number.");
                sc.next();
            }
        }
        return num;
    }


    public static void main(String[] args) {
        int number = askForNumber("Please enter a number: ");
        System.out.println(number);
        int numInRange = askForNumberInRange("Please enter a number between 10 and 100: ", 10, 100);
        System.out.println(numInRange);
    }
}
