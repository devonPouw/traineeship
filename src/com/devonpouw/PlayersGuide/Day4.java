package com.devonpouw.PlayersGuide;

public class Day4 {
   static int myInt = 2_000_000_000;
   static String myString = "hello";
   static boolean myBoolean = true;
   static char myChar = 't';
   static double myDouble = 1.392_847_239_847_893;
   static  byte myByte = 3;
   static long myLong = 3_123_912_103L;
   static short myShort = 10_000;
   public static float myFloat = 5.0655675F;
    public static void main(String[] args) {

        System.out.println("Example of int = " + (myInt = 3));
        System.out.println("Example of string = " + (myString = "doei"));
        System.out.println("Example of boolean = " + (myBoolean = false));
        System.out.println("Example of char = " + (myChar = 'u'));
        System.out.println("Example of double = " + (myDouble = 123.12312));
        System.out.println("Example byte = " + (myByte = 1));
        System.out.println("Example of long = " + (myLong = 5234234l));
        System.out.println("Example of short = " + (myShort = 200));
        System.out.println("Example of float = " + (myFloat = 2.1234f));

    }
}
