package com.devonpouw.SimpleExercises.BelowTwentyLines;

import java.util.Scanner;

public class Task25 {
    private static void tables() {
        System.out.print("Input a number: ");
        Scanner sc = new Scanner(System.in);
        int multiple = sc.nextInt();
        int result;
        for (int count = 1; count <= 10; count++) {
            result = multiple * count;
            System.out.println(multiple + " x " + count + " = " + result);
        }
    }

    public static void main(String[] args) {
        tables();
    }
}
