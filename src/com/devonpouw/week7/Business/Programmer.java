package com.devonpouw.week7.Business;

import java.util.ArrayList;

public class Programmer extends Employee{
    private ArrayList<String> programmingLanguages;
    public Programmer(String name, String address, String phoneNumber, float experienceInYears, ArrayList<String> programmingLanguages){
        super(name, address, phoneNumber, experienceInYears);
        this.programmingLanguages = programmingLanguages;

    }

    public ArrayList<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(ArrayList<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
    public void writeCode(){
        System.out.println("Hello World!");
    }
}
