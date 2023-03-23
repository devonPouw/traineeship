package com.devonpouw.week4;

import java.util.Scanner;

public class OddEvenTest {
    public static boolean isOdd(int input) {

        return input % 2 != 0;
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isOdd(number));
    }
}
