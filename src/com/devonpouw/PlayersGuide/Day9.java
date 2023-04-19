package com.devonpouw.PlayersGuide;

import java.util.Scanner;

public class Day9 {
   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println("Enter a number to listen to the clock: ");
            int clock = input.nextInt();
            String sound = (clock % 2 == 0) ? "tick" : "tock";
            System.out.println(sound);
        }while (true);
    }
    }
