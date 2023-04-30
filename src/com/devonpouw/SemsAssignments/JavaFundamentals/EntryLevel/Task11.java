package com.devonpouw.SemsAssignments.JavaFundamentals.EntryLevel;

public class Task11 {
    public static void repeatAddition(int n) {
        int digits = 0;
        int result = n + 11 * n + 111 * n;
        System.out.println(n + " + " + n + n + " + " + n + n + n + " = " + result);
        while (result != 0) {
            result /= 10;
            ++digits;
        }
        System.out.println("Digits: " + digits);
    }

    public static void main(String[] args) {
        repeatAddition(3);
    }
}
