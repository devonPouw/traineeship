package com.devonpouw.SimpleExercises.BelowTwentyLines;

public class Task2 {
    private static void divide(int counter, int num) {
        try {
            System.out.println(counter / num);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        }
    }

    public static void main(String[] args) {
        divide(2, 0);
    }
}
