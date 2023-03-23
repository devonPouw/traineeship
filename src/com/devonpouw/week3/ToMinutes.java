package com.devonpouw.week3;


import java.util.Scanner;

public class ToMinutes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        final short YEARS_TO_DAYS = 365;
        final byte MONTHS_TO_DAYS = 30;
        final byte WEEKS_TO_DAYS = 7;
//525600 + 43200 + 10080 + 1440 + 60
        System.out.println("How many years? (0-1000)");
        short years = userInput.nextShort();
        System.out.println("How many months? (0-12");
        byte months = userInput.nextByte();
        System.out.println("How many weeks? (0-4)");
        byte weeks  = userInput.nextByte();
        System.out.println("How many days? (0-7)");
        byte days = userInput.nextByte();
        System.out.println("How many hours? (0-24)");
        byte hours = userInput.nextByte();

        int total = (((years*365*24*60) + months*30*24*60) + weeks*7*24*60) + days*24*60 + hours*60;
        System.out.println("Total amount of minutes = " + total);
    }
}
