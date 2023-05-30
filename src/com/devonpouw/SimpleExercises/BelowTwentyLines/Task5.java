package com.devonpouw.SimpleExercises.BelowTwentyLines;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Task5 {
    public static void systemTime() {
        System.out.printf("Current Date: %tc", ZonedDateTime.now());
        System.out.printf("\nCurrent Date: %tc", System.currentTimeMillis());
        System.out.println("\nCurrent Date " + LocalDateTime.now());
        System.out.println("Current Date " + ZonedDateTime.now());
    }

    public static void main(String[] args) {
        systemTime();
    }
}
