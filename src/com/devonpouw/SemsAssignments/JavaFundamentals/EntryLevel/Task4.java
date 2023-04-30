package com.devonpouw.SemsAssignments.JavaFundamentals.EntryLevel;

public class Task4 {
    public static int biggest(int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3) {
            return number1;
        } else if (number2 >= number1 && number2 >= number3) {
            return number2;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        System.out.println(biggest(10000, 112094, 2912));
    }
}

