package com.devonpouw.PlayersGuide;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        //variable a holds user input
        String a = input.next();
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        //variable b holds user input
        String b = input.next();
        // variable c holds "of Doom"
        String c = "of Doom";
        // variable d holds "3000"
        String d = "3000";
        System.out.println("The " + b + " " + a + " " + c + " " + d + "!");
    }
}
