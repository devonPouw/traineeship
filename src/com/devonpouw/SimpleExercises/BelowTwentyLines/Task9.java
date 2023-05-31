package com.devonpouw.SimpleExercises.BelowTwentyLines;

public class Task9 {
    public static void printOddNumbers1to100() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printOddNumbers1to100();
    }
}
