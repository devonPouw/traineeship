package com.devonpouw.SemsAssignments.JavaFundamentals.IntermediateLevel;

public class Task3 {
    public static void printStrings(String text, int repetitions) {
        for (int i = 0; i < repetitions; i++) {
            System.out.print("row" + i + ": ");
            for (int j = 0; j < repetitions; j++) {
                System.out.print(text + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printStrings("abcd", 5);
    }
}