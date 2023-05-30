package com.devonpouw.OwnProjects;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalDate {
    public static void localDate() {
        String pattern = "E, dd MMM yyyy HH:mm:ss z";
        String pattern2 = "w";
        String pattern3 = "D";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(pattern3);
        String date = simpleDateFormat.format(new Date());
        String weekInYear = simpleDateFormat2.format(new Date());
        String dayInYear = simpleDateFormat3.format(new Date());
        System.out.print(date + " Dag " + dayInYear + " Week " + weekInYear);
    }

    public static void main(String[] args) {
        localDate();
    }
}
