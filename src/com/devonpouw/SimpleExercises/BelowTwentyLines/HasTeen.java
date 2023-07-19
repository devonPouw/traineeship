package com.devonpouw.SimpleExercises.BelowTwentyLines;

public class HasTeen {

    public static void main(String[] args) {
        System.out.println(containsTeen(13, 20, 10));
        System.out.println(containsTeen(20, 19, 10));
        System.out.println(containsTeen(20, 30, 7));
    }

    public static boolean containsTeen(int age1, int age2, int age3) {
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }

    public static boolean isTeen(int age) {
        return age <= 19 && age >= 13;
    }
}
