package com.devonpouw.SemsAssignments.JavaFundamentals.IntermediateLevel;

import java.util.ArrayList;

public class Task10 {
    public static int[] moveZeros(int[] arr) {
        int[] result = new int[arr.length];
        int arrayCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[arrayCounter++] = arr[i];
//                arrayCounter++;
            }
        }
        return result;
    }

    public static ArrayList<Integer> moveZeros(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            list.remove((Integer) 0);
            size--;
        }
        for (int i = 0; i < size; i++) {
            list.add(0);
        }
        return list;
    }

    public static void testMoveZeros() {
        int[] array = {0, 0, 1, 0, 3, 0, 5, 0, 6};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(6);
        list.add(3);
        list.add(0);
        list.add(0);
        list.add(9);
        list.add(4);
        list.add(0);
        list.add(1);
        int[] noZerosArr = moveZeros(array);
        ArrayList<Integer> noZerosList = moveZeros(list);
        for (int i = 0; i < noZerosArr.length; i++) {
            System.out.print(noZerosArr[i] + ", ");
        }
        //Expected: "1, 3, 5, 6, 0, 0, 0, 0, 0, "
        System.out.println();
        for (int i = 0; i < noZerosList.size(); i++) {
            System.out.print(noZerosList.get(i) + ", ");
        }
        //Expected: "6, 3, 9, 4, 1, 0, 0, 0, 0, "
    }

    public static void main(String[] args) {
        testMoveZeros();
    }
}
