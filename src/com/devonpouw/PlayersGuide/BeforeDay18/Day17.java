package com.devonpouw.PlayersGuide.BeforeDay18;

public class Day17 {
    public static int sum(int x) {
        if (x > 0) {
            System.out.println(x);
            return x + sum(x - 1);
        } else {
            return 0;
        }
    }

    public static void counter(int k) {
        if (k > 0) {
            System.out.println(k);
            counter(k - 1);
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        counter(10);
    }
}
