package com.devonpouw.PlayersGuide.Day18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day18 {

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
}