package com.devonpouw.PlayersGuide;

import java.util.Scanner;

public class Day5Challenge2 {

    /*Scanner input = new Scanner(System.in);
    //Area = base x height / 2
    double height = input.nextDouble();
    double base = input.nextDouble();
    double area = (height*base/2);*/


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Area = base x height / 2
        System.out.println("What is the height of the triangle?");
        double height = input.nextDouble();
        System.out.println("What is the base of the triangle?");
        double base = input.nextDouble();
        double area = (height*base/2);

        System.out.println("The area of the triangle is: " + area);
    }
}
