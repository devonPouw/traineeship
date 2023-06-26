package com.devonpouw.PlayersGuide.Day21;

import java.util.Scanner;

public class ArrowShop {


    public static Arrow createEliteArrow() {
        return new Arrow(ArrowHead.STEEL, Fletchling.PLASTIC, 95);
    }

    public static Arrow createMarksmanArrow() {
        return new Arrow(ArrowHead.STEEL, Fletchling.GOOSE_FEATHERS, 65);
    }

    public static Arrow createBeginnerArrow() {
        return new Arrow(ArrowHead.WOOD, Fletchling.GOOSE_FEATHERS, 75);
    }

    public static void printEliteArrow() {
        System.out.println("2. The Elite Arrow:");
        System.out.printf("Arrowhead: %s\nFletchling: %s\nLength: %scm\n", createEliteArrow().getArrowhead(), createEliteArrow().getFletchling(), createEliteArrow().getLength());
    }

    public static void printMarksmanArrow() {
        System.out.println("1. The Marksman Arrow:");
        System.out.printf("Arrowhead: %s\nFletchling: %s\nLength: %scm\n", createMarksmanArrow().getArrowhead(), createMarksmanArrow().getFletchling(), createMarksmanArrow().getLength());
    }

    public static void printBeginnerArrow() {
        System.out.println("0. The Beginner Arrow:");
        System.out.printf("Arrowhead: %s\nFletchling: %s\nLength: %scm\n", createBeginnerArrow().getArrowhead(), createBeginnerArrow().getFletchling(), createBeginnerArrow().getLength());
    }

    public static void pre_madeArrow() {
        Scanner scanner = new Scanner(System.in);
        printBeginnerArrow();
        System.out.println();
        printMarksmanArrow();
        System.out.println();
        printEliteArrow();
        int arrowChoice = scanner.nextInt();
        if (arrowChoice == 0) {
            System.out.print("You chose The Beginner Arrow");
        } else if (arrowChoice == 1) {
            System.out.print("You chose The Marksman Arrow");
        } else {
            System.out.println("You chose the Elite Arrow");
        }
    }

    private void createArrow() {
        Scanner sc = new Scanner(System.in);
        Arrow arrow = new Arrow(null, null, 0);

        System.out.println("Select the type of arrowhead: ");
        for (ArrowHead arrowhead : ArrowHead.values()) {
            System.out.println(arrowhead.ordinal() + ". " + arrowhead);
        }
        int arrowHeadChoice = sc.nextInt();
        arrow.setArrowhead(ArrowHead.values()[arrowHeadChoice]);

        System.out.println("Select the type of fletchling: ");
        for (Fletchling fletchling : Fletchling.values()) {
            System.out.println(fletchling.ordinal() + ". " + fletchling);
        }
        int fletchlingChoice = sc.nextInt();
        arrow.setFletchling(Fletchling.values()[fletchlingChoice]);


        System.out.println("Choose the length of the shaft between 60 & 100 cm: ");
        int lengthChoice = sc.nextInt();
        arrow.setLength(lengthChoice);
//        float shaftCost = (lengthChoice * 0.05f);


        System.out.printf("Your new arrow has a %s tip with a %s fletchling and is %s cm long\n", arrow.getArrowhead(), arrow.getFletchling(), arrow.getLength());

    }


    public static void main(String[] args) {
        ArrowShop shop = new ArrowShop();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my arrowshop: \n" +
                "Do you want to purchase a custom arrow or pre-made?");
        System.out.println("0. custom");
        System.out.println("1. pre-made");
        int choice = scanner.nextInt();
        if (choice == 0) {
            shop.createArrow();
        } else {
            pre_madeArrow();
        }
    }

}
