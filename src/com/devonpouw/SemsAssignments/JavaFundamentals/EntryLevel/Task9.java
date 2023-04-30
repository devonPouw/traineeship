package com.devonpouw.SemsAssignments.JavaFundamentals.EntryLevel;

public class Task9 {
    public static double calculatePercentage(double percentage, int number) {
        return ((double) number / 100) * percentage;
    }

    public static void main(String[] args) {
        System.out.println(calculatePercentage(10, 8346));
    }
}
