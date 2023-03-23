package com.devonpouw.week3;

import java.util.Scanner;

public class Speed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What distance did you travel? (in meters)");
        double distanceInMeters = scanner.nextDouble();

        System.out.println("How many hours did it take?");
        double hours = scanner.nextDouble();

        System.out.println("How many minutes did it take?");
        double minutes = scanner.nextDouble();

        System.out.println("How many seconds did it take?");
        double seconds = scanner.nextDouble();


        double timeInSeconds = hours*60*60 + minutes*60 + seconds;
        double meterPerSecond = distanceInMeters/timeInSeconds;
        System.out.println("Expected results:");
        System.out.println("Your speed in meter/second = " + meterPerSecond);
        //System.out.println("Your speed in km/h = ");
        //System.out.println("Your speed in miles/h = ");

    }
}
