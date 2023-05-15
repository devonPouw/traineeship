package com.devonpouw.SemsAssignments.JavaFundamentals.IntermediateLevel;

public class Task8 {
    public static String reverseString(String text) {
        StringBuilder result = new StringBuilder();
        result.append(text);
        result.reverse();
        return String.valueOf(result);
    }

    public static void testReverseString() {
        String test1 = reverseString("The system was hacked");
        String test2 = reverseString("Strings are complex");
        String test3 = reverseString("step on no pets");
        System.out.println(test1);
        //Expected: "dekcah saw metsys ehT"
        System.out.println(test2);
        //Expected: "xelpmoc era sgnirtS"
        System.out.println(test3);
        //Expected: "step on no pets"
    }

    public static void main(String[] args) {
        testReverseString();
    }
}
