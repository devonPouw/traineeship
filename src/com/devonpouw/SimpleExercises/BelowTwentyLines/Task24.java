package com.devonpouw.SimpleExercises.BelowTwentyLines;

public class Task24 {
    private static String ageCheckForMA15Rated(int age, boolean isSupervised) {
        if (age >= 15 || isSupervised) {
            return "You are allowed to see this movie";
        }
        return "You are not allowed to see this movie";
    }

    public static void main(String[] args) {
        System.out.println(ageCheckForMA15Rated(14, false));
    }
}

