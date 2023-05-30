package com.devonpouw.SemsAssignments.JavaFundamentals.IntermediateLevel;

public class Task11 {
    public static int binarySearch(int[] sortedArray, int
            valueToSearch) {
        int result = -1;
        for (int i = 0; i < sortedArray.length; i++) {
            if (valueToSearch == sortedArray[i]) {
                return i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 1, 5, 10, 15};
        System.out.println(binarySearch(sortedArray, 1));
    }
}
