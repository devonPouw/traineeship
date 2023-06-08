package com.devonpouw.SimpleExercises.BelowTwentyLines;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task16 {

    public static void localDate() {
        String pattern = "yyyy/MM/dd HH:mm:ss.S ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.print(date);
    }

    public static void main(String[] args) {
        localDate();
    }
}

