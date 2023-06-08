package com.devonpouw.SimpleExercises.BelowTwentyLines;

import java.nio.charset.Charset;

public class Task11 {
    public static void ListOfCharsets() {
        System.out.println("List of available character sets: ");
        for (String charSetName : Charset.availableCharsets().keySet()) {
            System.out.println(charSetName);
        }
    }

    public static void main(String[] args) {
        ListOfCharsets();
    }
}
