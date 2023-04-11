package com.devonpouw.week6;

public class FibonacciReeks {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
    public static int fibonacci(int n) {
        return n < 2 ? n : fibonacci((n - 1)) + fibonacci((n - 2));


            }
        }
