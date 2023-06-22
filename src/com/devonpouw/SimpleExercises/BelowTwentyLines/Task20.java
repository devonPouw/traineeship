package com.devonpouw.SimpleExercises.BelowTwentyLines;

import java.util.Scanner;

public class Task20 {
    public static void celsiusToFahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
    }

    public static void main(String[] args) {
        celsiusToFahrenheit();
    }
}