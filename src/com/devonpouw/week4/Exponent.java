package com.devonpouw.week4;

import java.util.Scanner;

public class Exponent {

    public static void main(String[] args) {
        System.out.println(exponent(3, 4));
        System.out.println();
    }

    private static int exponent(int base, int exp) {
        return (int) Math.pow(base, exp);

    }
}