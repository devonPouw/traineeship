package com.devonpouw.PlayersGuide.Day19;


public enum ChestStates {
    OPEN("open"),
    UNLOCKED("unlocked"),
    LOCKED("locked");
    final String state;

    ChestStates(String state) {
        this.state = state;
    }
}
