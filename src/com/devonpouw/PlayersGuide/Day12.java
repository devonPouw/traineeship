package com.devonpouw.PlayersGuide;

import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pick a number between 0 and 1000:");
        int randomNum = (int) (Math.random() * 1001);
        int guesses = 10;

        do{
            if (guesses == 0) {
                System.out.println("Game over");
                return;
            }
            int guess = scanner.nextInt();
            if (guess > randomNum){
                guesses--;
                System.out.println(guesses + " guesses left");
                System.out.println("Your guess was too high");
            } else if (guess < randomNum){
                guesses--;
                System.out.println(guesses + " guesses left");
                System.out.println("Your guess was too low");
            }

            else {
                System.out.println("You guessed the right number");
                return;
            }
        }while (true);
    }
}