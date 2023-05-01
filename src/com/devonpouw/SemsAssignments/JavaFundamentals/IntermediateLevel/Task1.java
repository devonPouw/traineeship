package com.devonpouw.SemsAssignments.JavaFundamentals.IntermediateLevel;

import java.util.Arrays;

public class Task1 {
    public static int min(int[] numbers) {
        return Arrays.stream(numbers).min().getAsInt();
    }

    public static void main(String[] args) {
        int test = min(new int[]{1, 5, 102, 95});
        System.out.println(test);
    }
}
