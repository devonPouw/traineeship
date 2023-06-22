package com.devonpouw.SimpleExercises.BelowTwentyLines;

public class Task21 {
    public static int recursion(int n) {
        if (n >= 0) {
            System.out.println(n);
            return n + recursion(n - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        recursion(8);
    }
}