package com.devonpouw.PlayersGuide;

import java.util.Scanner;

public class Day7 {
    final static int estate = 1;
    final static int dutchy = 3;
    final static int province = 6;
    public static void main(String[] args) {
        System.out.println("Please enter the amount of estates owned:");
        Scanner estateScanner = new Scanner(System.in);
        int amountOfEstates = estateScanner.nextInt();
        int estatePoints = amountOfEstates*estate;

        System.out.println("Please enter the amount of dutchies owned:");
        Scanner dutchyScanner = new Scanner(System.in);
        int amountOfDutchies = dutchyScanner.nextInt();
        int dutchiePoints = amountOfDutchies*dutchy;

        System.out.println("Please enter the amount of provinces owned:");
        Scanner provinceScanner = new Scanner(System.in);
        int amountOfProvinces = provinceScanner.nextInt();
        int provincePoints = amountOfProvinces*province;

        int totalPoints = estatePoints+dutchiePoints+provincePoints;
        System.out.println("Your total amount of points are: " + totalPoints);

    }
}
