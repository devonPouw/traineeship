package com.devonpouw.PlayersGuide;

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
        int inputInRange;
        do {
            try {
                System.out.println(text);
                inputInRange = sc.nextInt();
            } catch (InputMismatchException ex) {
                sc.next();
                continue;
            }
            return inputInRange;
        } while (true);
    }


    public static void main(String[] args) {
       int num = askForNumber("Please enter a number: ");
        System.out.println(num);
        int numInRage = askForNumberInRange("Please enter a number", 10, 20);
    }
}
