package com.devonpouw.week7.Business;

public class Employee {
    private String name;
    private String address;
    private String phoneNumber;
    private float experienceInYears;

    //constructor
    public Employee(String name, String address, String phoneNumber, float experienceInYears){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.experienceInYears = experienceInYears;
    }
    public Employee(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.experienceInYears = 0;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(float experienceInYears) {
        if(experienceInYears < 0 || experienceInYears > 75){
            return;
        }
        this.experienceInYears = experienceInYears;
    }
    public String toString(){
        return "Deze medewerker heet " + name;
    }
}
