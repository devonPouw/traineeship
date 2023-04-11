package com.devonpouw.week5;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What word you want to reverse?");
        String input = scanner.next();
        StringBuilder builder = new StringBuilder();
        for (int i = input.length(); i > 0; i--) {
            builder.append(input.charAt(i - 1));
        }
        if(input.equalsIgnoreCase(String.valueOf(builder))){
            System.out.println(builder + " is een palindroom");
        }else
            System.out.println(builder);
    }
}