package com.devonpouw.week7;

import java.util.Scanner;

public class Tafels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tafelmaker: Vul het aantal tafels in (Max 31):");
        int aantal = sc.nextInt();
        for (int i = 0; i <= aantal; i++){
            if (i == 0){
            System.out.print("\n * |");
            }
            else {
                System.out.printf("%4d", i);
            }
        }
        for (int j = 0; j <= aantal; j++){
            if(j == 0){
                System.out.print("\n");
            }
            System.out.print("----");
        }
        for (int i = 1; i <= aantal; i++) {
            System.out.printf("\n%2d |", i);
            for (int j = 1; j <= aantal; j++) {
                System.out.printf("%4d", j * i);
            }
        }
    }

}
