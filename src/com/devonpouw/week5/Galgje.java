package com.devonpouw.week5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Galgje {
    public static void main(String[] args) {
        String word = askForString("Enter word for hangman: ").toLowerCase();
        List<Character> guessed_letters = new ArrayList<>();
        int tries = 1;
        final int MAX_TRIES = 5;

        do {
            guessed_letters.add(askForChar("Enter character for guess: "));
            boolean last_guess_correct = false;
            for (char c : word.toCharArray()) {
                if (guessed_letters.get(guessed_letters.size() - 1) == c) {
                    last_guess_correct = true;
                    break;
                }
            }
            if (!last_guess_correct) {
                tries++;
            }
            printGuesses(word, guessed_letters, MAX_TRIES - tries + 1);
        } while (!gameComplete(word, guessed_letters, MAX_TRIES - tries));
        if (tries >= 0 && gameWon(word, guessed_letters)) {
            System.out.println("you win");
        } else {
            System.out.println("you lost");
        }
    }

    private static boolean gameWon(final String word, final List<Character> guessed_letters) {
        List<Character> correct_letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            if (guessed_letters.contains(c)) {
                correct_letters.add(c);
            }
        }
        return word.length() == correct_letters.size();
    }

    private static boolean gameComplete(final String word, final List<Character> guessed_letters, int tries_remaining) {
        if (tries_remaining < 0) {
            return true;
        }
        return gameWon(word, guessed_letters);
    }

    /**
     * Prints the current state of the game and asks for next character.
     * @param word Word currently being guessed.
     * @param guessed_letters List of char of characters guessed so far.
     * @param tries_remaining Amount of guesses remaining.
     */
    private static void printGuesses(final String word, final List<Character> guessed_letters, final int tries_remaining) {
        List<Character> incorrect_letters = new ArrayList<>(guessed_letters);
        System.out.print("Word: ");
        for (char c : word.toCharArray()) {
            System.out.printf("%c ", guessed_letters.contains(c) ? c : '_');
            incorrect_letters.removeIf(n -> (c == n));
        }
        System.out.printf("| Remaining: %d ", tries_remaining);
        System.out.print("| Incorrect: ");
        incorrect_letters.forEach(c -> System.out.print(c));
        System.out.println(" |");
    }

    /**
     * Utility function to ask for a character in the terminal.
     * @param prompt Question to print to terminal.
     * @return char value.
     */
    public static char askForChar(String prompt) {
        char choice;
        String scan_out;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.print(prompt);
                scan_out = scan.next();
                if (scan_out.length() > 1) {
                    System.out.println("Enter only one character please.");
                    continue;
                }
                choice = scan_out.charAt(0);
            } catch (InputMismatchException ex) {
                System.out.println("Invalid choice entered, please try again.");
                scan.next();
                continue;
            }
            return choice;
        } while (true);
    }

    /**
     * Utility function to ask for a string in the terminal.
     * @param prompt Question to print to terminal.
     * @return String value.
     */
    public static String askForString(String prompt) {
        String choice;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.print(prompt);
                choice = scan.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("Invalid choice entered, please try again.");
                scan.next();
                continue;
            }
            return choice;
        } while (true);
    }
}