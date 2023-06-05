package com.devonpouw.SimpleExercises.BelowTwentyLines;

import java.util.Scanner;

public class Task14 {
    public static void decimalToOctal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int dec = sc.nextInt();
        System.out.println("Octal number is: " + Integer.toOctalString(dec));
    }

    public static void main(String[] args) {
        decimalToOctal();
    }
}
