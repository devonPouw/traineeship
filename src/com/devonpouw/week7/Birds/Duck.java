package com.devonpouw.week7.Birds;

public class Duck extends Bird{
    public boolean webbedFeet;
    public Duck(String name, int numberOfEggs, String voice, String color, boolean fly, int legs, boolean webbedFeet){
    super(name, numberOfEggs, voice, color, fly, legs);
    this.webbedFeet = webbedFeet;

    }

    public boolean isWebbedFeet() {
        return webbedFeet;
    }
}
