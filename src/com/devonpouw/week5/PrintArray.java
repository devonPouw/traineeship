package com.devonpouw.week5;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the amount of items in numbers:");
        int NUM_ITEMS = scanner.nextInt();
        System.out.println("Input the value of all items (separated by spaces):");
        String value = scanner.next();

        String[] items = new String[NUM_ITEMS];

        value = Arrays.toString(value.toCharArray());
      //  value.toCharArray(Str)
        System.out.println(value);

        //for (int i = value.length(); i > 0 ; i++);
       // System.out.println(value);
    }
}
