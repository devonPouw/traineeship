package com.devonpouw.week8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OpenFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("players_guide_java.pdf");

        } catch (FileNotFoundException e) {
            System.out.println("File might not exist");
        }
    }
}