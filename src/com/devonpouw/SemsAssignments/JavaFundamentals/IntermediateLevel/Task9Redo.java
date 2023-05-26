package com.devonpouw.SemsAssignments.JavaFundamentals.IntermediateLevel;

import java.util.ArrayList;

public class Task9Redo {
    public static ArrayList<Integer> calculateDifferences(int[] arr1, int[] arr2) {
        ArrayList<Integer> resultList = new ArrayList<>();

        int minLength = MyMath.min(arr1.length, arr2.length);
        int maxLength = MyMath.max(arr1.length, arr2.length);

        for (int i = 0; i < minLength; i++) {
            int difference = arr1[i] - arr2[i];
            resultList.add(difference);
        }

        if (arr1.length > arr2.length) {
            for (int i = minLength; i < maxLength; i++) {
                resultList.add(arr1[i]);
            }
        } else {
            for (int i = minLength; i < maxLength; i++) {
                resultList.add(arr2[i]);
            }
        }


        return resultList;
    }


    public static void main(String[] args) {
        int[] arr1 = {2, 7, 10, 15, 24};
        int[] arr2 = {0, 3, 12, 12, 18, 19, 98};
        System.out.println(calculateDifferences(arr1, arr2));
    }
}