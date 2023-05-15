package com.devonpouw.SemsAssignments.JavaFundamentals.IntermediateLevel;

public class Task6 {
    public static int exponential(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(exponential(2, 3));
    }
}
