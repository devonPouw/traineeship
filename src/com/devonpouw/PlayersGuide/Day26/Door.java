package com.devonpouw.PlayersGuide.Day26;


public class Door {
    private DoorState doorState;
    private String passcode;

    public Door(String passcode) {
        doorState = DoorState.CLOSED;
        if (isValidPasscode(passcode)) {
            this.passcode = passcode;
        } else {
            throw new IllegalArgumentException("Passcode did not meet the requirements");
        }
    }

    public String getState() {
        return "The door is currently " + doorState;
    }

    private boolean isValidPasscode(String passcode) {
        return passcode.matches("\\d{4}");
    }

    public boolean changePasscode(String oldPasscode, String newPasscode) {
        if (this.passcode.equals(oldPasscode) && isValidPasscode(newPasscode)) {
            this.passcode = newPasscode;
            return true;
        }
        return false;
    }

    public boolean unlock(String givenPasscode) {
        if (doorState == DoorState.LOCKED) {
            if (givenPasscode.equals(passcode)) {
                doorState = DoorState.CLOSED;
                System.out.println(getState());
                return true;
            }
        }
        return false;
    }

    public boolean lock() {
        if (doorState == DoorState.CLOSED) {
            doorState = DoorState.LOCKED;
            return true;
        }
        return false;
    }

    public boolean close() {
        if (doorState == DoorState.OPEN) {
            doorState = DoorState.CLOSED;
            return true;
        }
        return false;
    }

    public boolean open() {
        if (doorState == DoorState.CLOSED) {
            doorState = DoorState.OPEN;
            return true;
        }
        return false;
    }
}

enum DoorState {
    LOCKED,
    CLOSED,
    OPEN
}

enum DoorAction {
    OPEN, CLOSE, UNLOCK, LOCK
}