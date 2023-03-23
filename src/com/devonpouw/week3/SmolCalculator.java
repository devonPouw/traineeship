package com.devonpouw.week3;

import java.util.Scanner;

public class SmolCalculator {
    public static void main(String[] args) {
        int i = 0;
        boolean hasCorrectInput = false;
        while (!hasCorrectInput) {
            Scanner intScanner = new Scanner(System.in);
            try {
                i = intScanner.nextInt();
            } catch (Exception err) {
                System.out.println("Please enter valid Integer.");
                continue;

            }
            hasCorrectInput = true;
        }
        
        System.out.println(i);
    }
}