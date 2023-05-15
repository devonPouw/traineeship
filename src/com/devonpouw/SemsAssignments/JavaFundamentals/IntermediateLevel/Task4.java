package com.devonpouw.SemsAssignments.JavaFundamentals.IntermediateLevel;

public class Task4 {
    public static boolean checkSequence(int[] array) {
        if (array.length <= 1) {
            return false;
        }
        int verschil = array[1] - array[0];
        for (int i = 2; i < array.length; i++) {
            int volgendeVerschil = array[i] - array[i - 1];
            if (volgendeVerschil != verschil)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean test1 = checkSequence(new int[]{1, 2, 3, 4, 5, 9, 7});
        boolean test2 = checkSequence(new int[]{1, 3, 5, 7, 9, 11});
        boolean test3 = checkSequence(new int[]{2, 4, 6, 8, 10, 12});
        boolean test4 = checkSequence(new int[]{1});
        System.out.println(test1 + ", " + test2 + ", " + test3 + ", " + test4);
    }
}
