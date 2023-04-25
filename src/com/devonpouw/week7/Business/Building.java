package com.devonpouw.week7.Business;

import java.util.ArrayList;

public class Building {
    public static void main(String[] args) {
        ArrayList<String> marksProgrammingLanguages = new ArrayList<>();
        marksProgrammingLanguages.add("C#");
        marksProgrammingLanguages.add("JAVA");
        marksProgrammingLanguages.add("SQL");
        marksProgrammingLanguages.add("JavaScript");
        Manager myManager = new Manager("Sem", "ITvitae", "0612345678", 5, 10);
        Programmer myProgrammer = new Programmer("Mark", "ITvitae", "0687654321", 8, marksProgrammingLanguages);
        Salesman mySalesman = new Salesman("Arjan", "ITvitae", "0600022233", 1, 150_000);

        System.out.println(myManager + " en heet " + myManager.getName());
    }
}
