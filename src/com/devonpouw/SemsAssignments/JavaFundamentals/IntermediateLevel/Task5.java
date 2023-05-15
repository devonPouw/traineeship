package com.devonpouw.SemsAssignments.JavaFundamentals.IntermediateLevel;

public class Task5 {
    public static void multiplesOf(int divisor, int range) {
        //  int num = divisor;
        for (int i = divisor; i <= range; i += divisor) {
            System.out.print(i);
            if (i == range - divisor) {
                break;
            }
            System.out.print(", ");
            // i += divisor;
        }
    }

    public static void main(String[] args) {
        multiplesOf(5, 100);
    }
}
