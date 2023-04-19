package com.devonpouw.week4;

import java.util.Scanner;

public class Test {
    public static String even_or_odd(int number) {
        String result = (number % 2 == 0) ? "Even" : "Odd";
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Principal:");
        double principal = sc.nextDouble();

        if (principal < 1000 || principal > 100000) {
            System.out.println("enter principal again:");
            principal = sc.nextDouble();
            System.out.println(principal);
        }
    }
}