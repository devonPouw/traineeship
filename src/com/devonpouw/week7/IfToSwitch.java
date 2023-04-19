package com.devonpouw.week7;

public class IfToSwitch {
    public static void main(String[] args) {
        String browser = "IE";
        switch (browser) {
            case "Edge":
                System.out.println("Je gebruikt Edge");
                break;
            case "Chrome":
            case "Firefox":
            case "Opera":
                System.out.println("Je gebruikt een moderne browser");
                break;
            case "IE":
                System.out.println("Waarom gebruik je Internet Explorer?");
                break;
            default:
                System.out.println("Je gebruikt een browser die niet ondersteund wordt");
                break;


        }
    }
}
