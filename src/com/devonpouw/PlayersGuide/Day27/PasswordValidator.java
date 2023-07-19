package com.devonpouw.PlayersGuide.Day27;

public class PasswordValidator {
    private static boolean isValid(String password) {
        char[] a = password.toCharArray();
        if (password.length() <= 6 || password.length() >= 13) {
            return false;
        }
        for (char letter : a) {
            if (letter == 'T' || letter == '&') {
                return false;
            }
            if (Character.isDigit(letter)) {
                return true;
            }
            if (Character.isLowerCase(letter)) {
                return true;
            }
            if (Character.isUpperCase(letter)) {
                return true;
            }
        }
        return true;
    }
}
