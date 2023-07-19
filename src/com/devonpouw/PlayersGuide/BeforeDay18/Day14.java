package com.devonpouw.PlayersGuide.BeforeDay18;

import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] getallen = new int[5];
        int[] getallenKopie = new int[5];
        System.out.println("Enter 5 numbers to add to the list:");
        for (int i = 0; i < getallen.length; i++) {
            if (sc.hasNextInt()) {
                getallen[i] = sc.nextInt();
            }
        }
        getallenKopie[0] = getallen[0];
        getallenKopie[1] = getallen[1];
        getallenKopie[2] = getallen[2];
        getallenKopie[3] = getallen[3];
        getallenKopie[4] = getallen[4];


        System.out.println("The elements in the array are:");
        for (int j : getallen) {
            System.out.print(j + " ");
        }
        System.out.println("\n\nThe elements in the copied array are:");
        for (int jCopy : getallenKopie) {
            System.out.print(jCopy + " ");
        }
    }

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        return String.valueOf(stringBuilder);
    }
}
