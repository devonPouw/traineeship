package com.devonpouw.PlayersGuide.BeforeDay18;

import java.util.Scanner;

public class Day6 {
    final static int amountOfSisters = 4;

    public static void main(String[] args) {
        System.out.println("How many eggs were gathered today?");
        Scanner eggs = new Scanner(System.in);
        int eggsGathered = eggs.nextInt();
        int eggsForDuckBear = eggsGathered % amountOfSisters;
        int eggsForSisters = eggsGathered / amountOfSisters;

        System.out.println("Sisters gets " + eggsForSisters + " egg(s) each");
        System.out.println("DuckBear gets: " + eggsForDuckBear + " egg(s)");


    }


}
