package com.devonpouw.SemsAssignments.JavaFundamentals.EntryLevel;

public class Task7 {
    public static boolean isTheSame(String message1, String message2) {
        return message1.equals(message2);
    }

    public static void main(String[] args) {
        System.out.println(isTheSame("hello", "hello"));
    }
}
