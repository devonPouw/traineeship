package com.devonpouw.PlayersGuide;

public class Day17 {
    public static int sum(int x) {
        if (x > 0) {
            return x + sum(x-1);
        } else {
            return 0;
        }
    }
    public static int counter(int k){
        if(k > 0) {
            return k - counter(k-1);
        } else {
            return 0;
        }
    }
        public static void main (String[]args){
            int result = sum(10);
            int result2 = counter(10);
            System.out.println(result);
            System.out.println(result2);
        }
    }
