package com.devonpouw.SimpleExercises.BelowTwentyLines;


public class Task17 {
    public static void AreaAndPerimeterCircle(double radius) {
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        AreaAndPerimeterCircle(7.5);
    }
}
