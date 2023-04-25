package com.devonpouw.PlayersGuide.BeforeDay18;

import java.awt.*;
import java.util.Scanner;

public class Day8 {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        System.out.print("Target row: ");
        Scanner rowScanner = new Scanner(System.in);
        int targetRow = rowScanner.nextByte();

        System.out.print("Target column: ");
        Scanner columnScanner = new Scanner(System.in);
        int targetColumn = columnScanner.nextByte();

        int rowTarget1 = targetRow;
        int rowTarget2 = targetRow - 1;
        int rowTarget3 = targetRow;
        int rowTarget4 = targetRow + 1;
        int columnTarget1 = targetColumn - 1;
        int columnTarget2 = targetColumn;
        int columnTarget3 = targetColumn + 1;
        int columnTarget4 = targetColumn;

        System.out.println("Deploy to:");
        System.out.println(ANSI_RED + "(" + rowTarget1 + ", " + columnTarget1 + ')');
        System.out.println("(" + rowTarget2 + ", " + columnTarget2 + ')');
        System.out.println("(" + rowTarget3 + ", " + columnTarget3 + ')');
        System.out.println("(" + rowTarget4 + ", " + columnTarget4 + ')' + ANSI_RESET);
        Toolkit.getDefaultToolkit().beep();

    }
}