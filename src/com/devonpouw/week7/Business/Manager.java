package com.devonpouw.week7.Business;

public class Manager extends Employee{
    private int teamSize;
    public Manager(String name, String address, String phoneNumber, float experienceInYears, int teamSize){
        super(name, address, phoneNumber, experienceInYears);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public void reportProjectStatus(){
        System.out.println("Do your job!");
    }
}
