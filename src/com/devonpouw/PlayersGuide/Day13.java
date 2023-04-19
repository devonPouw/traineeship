package com.devonpouw.PlayersGuide;

public class Day13 {
    public static void main(String[] args) {
        int fire = 3;
        int electric = 5;
        for (int i = 1; i <= 100; i++) {
            if (i % electric == 0 && i % fire == 0) {
                System.out.println(i + ". electric blast!!");
            } else if (i % fire == 0) {
                System.out.println(i + ". fire");
            } else if (i % electric == 0) {
                System.out.println(i + ". electric");
            } else {
                System.out.println(i + ". normal");

            }
        }
    }
}