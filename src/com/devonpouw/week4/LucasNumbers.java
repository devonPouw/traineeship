package com.devonpouw.week4;


public class LucasNumbers {
    public static final int input = 2;
    public static void main(String[] args) {
        int lucasNum1 = 2, lucasNum2 = 1, lucasNum3;

        if (input >= 0) {
            System.out.println("input is: " + input);
            for (int i = 1; i <= input; i++) {

                if (lucasNum1 + lucasNum2 < 0) {
                    System.out.println("Maximum lucas value: " + i);
                    return;
                }

                lucasNum3 = lucasNum1 + lucasNum2;
                if (i == 1) {
                    System.out.println(lucasNum1);
                } else if (i == 2) {
                    System.out.println(lucasNum2);
                } else if (i >= 3) {
                    System.out.println(lucasNum3);
                    lucasNum1 = lucasNum2;
                    lucasNum2 = lucasNum3;
                }
            }
        }else {
            System.out.println("Please input a positive number.");
        }
    }
}




