package com.devonpouw.PlayersGuide;

import java.util.Scanner;

public class Day14Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] getallen = new int[5];
        int[] getallenKopie = new int[5];
        System.out.println("Enter 5 numbers to add to the list:");
       for (int i = 0; i < getallen.length; i++){
           if(sc.hasNextInt()){
               getallen[i] = sc.nextInt();
           }
       }
           getallenKopie = getallen;

        System.out.println("The elements in the array are:");
        for (int j : getallen) {
            System.out.print(j + " ");
        }
        System.out.println("\n\nThe elements in the copied array are:");
        for (int jCopy : getallenKopie) {
            System.out.print(jCopy + " ");
        }
    }
}
