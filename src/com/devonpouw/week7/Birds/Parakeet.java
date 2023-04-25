package com.devonpouw.week7.Birds;

public class Parakeet extends Bird {
    private String mimics;
    public Parakeet(String name, int numberOfEggs, String voice, String color, boolean fly, int legs, String mimics){
        super(name, numberOfEggs, voice, color, fly, legs);
        this.mimics = mimics;
        
    }

    public String getMimics() {
        return mimics;
    }

    public void setMimics(String mimics) {
        this.mimics = mimics;
    }
}
