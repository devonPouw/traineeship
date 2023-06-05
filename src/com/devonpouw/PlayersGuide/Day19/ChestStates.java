package com.devonpouw.PlayersGuide.Day19;

import java.awt.*;
import java.util.Scanner;

public enum ChestStates {
    OPEN("open"),
    UNLOCKED("unlocked"),
    LOCKED("locked");
    final String state;

    ChestStates(String state) {
        this.state = state;
    }
}
