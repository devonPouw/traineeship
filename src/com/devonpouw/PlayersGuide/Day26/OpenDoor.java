package com.devonpouw.PlayersGuide.Day26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OpenDoor {

    static String state;
    static Door door;
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a 4 digit passcode: ");
            try {
                String passcode = scanner.next();
                door = new Door(passcode);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (door == null);
        //deur doet validatie en een functie in deze klasse gaat de passcode opvragen bij gebruiker
        //use door: loop
    }

    private static void openTheDoor() {
        boolean quit;
        System.out.println("Welcome to the door");
        System.out.println("This door can lock, unlock, open and close by logical order");
        do {
            quit = false;
            System.out.println(door.getState());
            System.out.println("What would you like to do with the door?");
            state = scanner.nextLine();
            if (state.equalsIgnoreCase("quit")) {
                quit = true;
            }
        } while (!quit);
    }

    private void switchingDoorStates(String choice, int currentPasscode) {
        System.out.println("Would you like to keep the same passcode? Or would you like to change it?");
        do {
            System.out.println("y/n");
        } while (!choice.equalsIgnoreCase("y") || !choice.equalsIgnoreCase("n"));
    }
}
