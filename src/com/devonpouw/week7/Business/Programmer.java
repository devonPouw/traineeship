package com.devonpouw.week7.Business;

public class Programmer extends Employee{
    private String programmingLanguages;
    public Programmer(String name, String address, String phoneNumber, float experienceInYears, String programmingLanguages){
        super(name, address, phoneNumber, experienceInYears);
        this.programmingLanguages = programmingLanguages;

    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
    public void writeCode(){
        System.out.println("Hello World!");
    }
}
