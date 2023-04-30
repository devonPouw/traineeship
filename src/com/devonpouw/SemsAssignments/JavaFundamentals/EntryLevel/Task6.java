package com.devonpouw.SemsAssignments.JavaFundamentals.EntryLevel;

public class Task6 {
    public static int countDigits(int number) {
        int result = 0;
        while (number != 0) {
            number /= 10;
            ++result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(152123));
    }
}
