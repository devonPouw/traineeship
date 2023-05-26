package com.devonpouw.SimpleExercises.TwentyLines;

public class Three {
    private static double rareSom(double a, double b, double c, double d, double e, double f) {
        return ((a * b - c * d) / (e - f));
    }

    public static void main(String[] args) {
        System.out.println(rareSom(25.5, 3.5, 3.5, 3.5, 40.5, 4.5));
    }
}
