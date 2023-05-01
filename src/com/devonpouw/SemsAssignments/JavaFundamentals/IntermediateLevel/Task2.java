package com.devonpouw.SemsAssignments.JavaFundamentals.IntermediateLevel;

public class Task2 {
    public static int countEven(int[] numbers) {
        int evenNums = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNums++;
            }
        }
        return evenNums;
    }

    public static void main(String[] args) {
        int test = countEven(new int[]{1, 2, 5, 10, 32, 103});
        System.out.println(test);
    }
}