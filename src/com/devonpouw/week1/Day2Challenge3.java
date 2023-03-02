package com.devonpouw.week1;

import java.util.Scanner;

public class Day2Challenge3 {
    public static void main(String[] args) {
        System.out.println(" Bread is ready.");
        System.out.println("Who is the bread for?");

        Scanner breaduser = new Scanner(System.in);
        String name = breaduser.next();

        System.out.println("Noted: "+ name +" got bread");


    }
}
