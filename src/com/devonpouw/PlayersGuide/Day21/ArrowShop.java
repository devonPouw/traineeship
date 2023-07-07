package com.devonpouw.PlayersGuide.Day21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrowShop {

    static List<Arrow> arrows = new ArrayList<>();

    public static void main(String[] args) {
        welcome();
        System.out.println("these are your arrows!");
        for (Arrow arrow : arrows) {
            System.out.println(arrowAsString(arrow));
        }
    }

    public static void printPreMadeArrowOptions() {
        System.out.println("0. The Beginner Arrow:");
        System.out.printf("Arrowhead: %s\nFletchling: %s\nLength: %scm\n", Arrow.createBeginnerArrow().getArrowhead(), Arrow.createBeginnerArrow().getFletchling(), Arrow.createBeginnerArrow().getLength());

        System.out.println("1. The Marksman Arrow:");
        System.out.printf("Arrowhead: %s\nFletchling: %s\nLength: %scm\n", Arrow.createMarksmanArrow().getArrowhead(), Arrow.createMarksmanArrow().getFletchling(), Arrow.createMarksmanArrow().getLength());

        System.out.println("2. The Elite Arrow:");
        System.out.printf("Arrowhead: %s\nFletchling: %s\nLength: %scm\n", Arrow.createEliteArrow().getArrowhead(), Arrow.createEliteArrow().getFletchling(), Arrow.createEliteArrow().getLength());
    }

    public static Arrow createPre_madeArrow() {
        Scanner scanner = new Scanner(System.in);
        printPreMadeArrowOptions();
        int arrowChoice = scanner.nextInt();
        if (arrowChoice == 0) {
            return Arrow.createBeginnerArrow();
        } else if (arrowChoice == 1) {
            return Arrow.createMarksmanArrow();
        }
        return Arrow.createEliteArrow();
    }

    private static Arrow createCustomArrow() {
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
        return arrow;
    }

    private static String arrowAsString(Arrow arrow) {
        return String.format("%s arrow tip with %s fletchling with a length of %d cm, costs %.2f gold", arrow.getArrowhead(), arrow.getFletchling(), arrow.getLength(), arrow.getCost());
    }

    private static void welcome() {
        boolean quit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my arrow shop: ");
        do {
            quit = false;
            System.out.println("Custom arrow or pre-made?");
            System.out.println("0. quit");
            System.out.println("1. pre-made");
            System.out.println("2. custom");
            int choice = scanner.nextInt();
            if (choice == 0) {
                quit = true;
            } else if (choice == 1) {
                arrows.add(createPre_madeArrow());
            } else {
                arrows.add(createCustomArrow());
            }
        } while (!quit);
    }
}
