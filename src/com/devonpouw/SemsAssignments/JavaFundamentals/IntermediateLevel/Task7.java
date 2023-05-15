package com.devonpouw.SemsAssignments.JavaFundamentals.IntermediateLevel;

import java.util.ArrayList;

public class Task7 {
    public static ArrayList<Integer> arrayToEvenList(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int number : array) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        result.add(2);
        result.add(4);
        result.add(6);
        return result;
    }

    public static ArrayList<Integer> arrayToEvenList2(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(arrayToEvenList(new int[]{1, 3, 5, 6, 8, 3, 4}));

    }
}
