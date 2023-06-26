package com.devonpouw.SimpleExercises.BelowTwentyLines;

public class Task27 {
    public static boolean parrotTrouble(boolean isTalking, int hour) {
        return (isTalking && (hour < 7 || hour > 20));
    }

    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
    }
}
