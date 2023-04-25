package com.devonpouw.week7.Birds;

public class Bird {
    private String name;
    private int numberOfEggs;
    private String voice;
    private String color;
    private boolean fly;
    private final int legs;
    public Bird(String name, int numberOfEggs, String voice, String color, boolean fly, int legs){
        this.name = name;
        this.numberOfEggs = numberOfEggs;
        this.voice = voice;
        this.color = color;
        this.fly = fly;
        this.legs = legs;
    }
    public String getName() {
        return name;
    }
    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public int getLegs() {
        return legs;
    }
}
