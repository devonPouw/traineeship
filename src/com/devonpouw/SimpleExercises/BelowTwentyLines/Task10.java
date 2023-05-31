package com.devonpouw.SimpleExercises.BelowTwentyLines;

public class Task10 {
    public static void multiplesOf3() {
        for (int i = 10; i < 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        multiplesOf3();
    }
}
