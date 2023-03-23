package com.devonpouw.week3.Encrypting;

import java.util.Scanner;

public class Decryptor {
        final static int n = -5;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type your received secret message: ");

            String message = scanner.nextLine();

            String result = "";

            for (char c : message.toCharArray()) {
                char r = (char) (c + n);

                result += r;
            }
            System.out.println(result);
        }
    }
