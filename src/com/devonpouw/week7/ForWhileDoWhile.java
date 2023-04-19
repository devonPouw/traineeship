package com.devonpouw.week7;

public class ForWhileDoWhile {
    public static void main(String[] args) {
        int[] list = new int[5];
        for (int i = 0; i < 5; i++){
            list[i] = i + 2;
        }
        int a = 0;
        do {
             list[a] = a + 2;
             a++;
        }while (a < 5);

        int b = 0;
        while(b < 5) {
            list[b] = b + 2;
            b++;
        }
    }
}
