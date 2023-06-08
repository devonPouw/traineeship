package com.devonpouw.SimpleExercises.BelowTwentyLines;

import java.util.Scanner;

public class Task18 {

    public static void decimalToHexadecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int hexa = sc.nextInt();
        System.out.println("Hexadecimal number is: " + Integer.toHexString(hexa).toUpperCase());
    }

    public static void main(String[] args) {
        decimalToHexadecimal();
    }
}
