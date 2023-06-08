package com.devonpouw.SimpleExercises.BelowTwentyLines;

import java.util.Scanner;

public class Task20 {
    public static void binaryToHexadecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binaryInput = sc.next();
        int toBinary = Integer.parseInt(binaryInput, 2);
        System.out.println("Hexadecimal number is: " + Integer.toHexString(toBinary).toUpperCase());
    }

    public static void main(String[] args) {
        binaryToHexadecimal();
    }
}
