package com.devonpouw.SimpleExercises.BelowTwentyLines;

import java.util.Scanner;

public class Task13 {
    public static void displayNumber() {
        System.out.print("Please input a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String n = String.valueOf(number);
        System.out.println(n + " + " + n + n + " + " + n + n + n);
    }

    public static void main(String[] args) {
        displayNumber();
    }


}
