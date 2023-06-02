package com.devonpouw.OwnProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        List<Integer> smallPrimes = new ArrayList<>(List.of(2, 3, 5, 7, 11, 13, 17, 19));
//        System.out.printf("I have %d primes\n", smallPrimes.size());
//        smallPrimes.add(23);
//        smallPrimes.add(29);
//        System.out.printf("I now have %d primes\n", smallPrimes.size());

        List<String> sentence = new ArrayList<>(List.of("the quick brown fox jumps over the lazy dog".split(" ")));
        System.out.println("Is there a dog? " + sentence.contains("dog"));
        System.out.println("Is there a fox? " + sentence.contains("fox"));
        System.out.println("Is there a cat? " + sentence.contains("cat"));
        System.out.println("The first position of 'the' is " + sentence.indexOf("the"));
        System.out.println("The last position of 'the' is " + sentence.lastIndexOf("the"));
        System.out.println("The position of 'cat' is " + sentence.indexOf("cat"));

        System.out.print("Please give the word to search: ");
        String soughtWord = in.next();
        System.out.println("That word is found at index " + sentence.indexOf(soughtWord));
    }
}
