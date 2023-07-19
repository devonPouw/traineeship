package com.devonpouw.OwnProjects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class ElvesOutOfPaper {

    //find the surface area of the box, which is 2*l*w + 2*w*h + 2*h*l.
    // Elves need twice the smallest side as extra paper.
    public static void main(String[] args) {
        readInformation();
    }

    public static void calculateDimension() {

    }

    public static void readInformation() {

        try {
            List<String> dimensions = Files.readAllLines(new File("src/com/devonpouw/iWasToldThereWouldBeNoMath.txt").toPath(), Charset.defaultCharset());
//            String[] paperDimensions = dimensions.split("x");
            for (String dimension : dimensions) {
                dimension.split("x");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
