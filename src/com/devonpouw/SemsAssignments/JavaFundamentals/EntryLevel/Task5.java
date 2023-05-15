package com.devonpouw.SemsAssignments.JavaFundamentals.EntryLevel;

public class Task5 {

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0;
    }

    public static void testLeapYear() {
        boolean test1 = isLeapYear(2012);
        boolean test2 = isLeapYear(2021);
        boolean test3 = isLeapYear(3220);
        System.out.print(test1 + ", " + test2 + ", " + test3);
        //Expected: "true, false, true"
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2012));
        testLeapYear();
    }
}
