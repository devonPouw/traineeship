package com.devonpouw.PlayersGuide.Day19;


public class Day19Chest {
    private ChestStates status;

    public Day19Chest(ChestStates chest) {
        status = chest;
    }

    public String getStatus() {
        return "The chest is currently: " + status;
    }

    public void setStatus(ChestAction action) {
        if (status == ChestStates.LOCKED) {
            if (action == ChestAction.UNLOCK) {
                status = ChestStates.UNLOCKED;
                System.out.println(getStatus());
            } else if (action == ChestAction.LOCK || action == ChestAction.CLOSE || action == ChestAction.OPEN) {
                System.out.println("this action is not possible because it's " + status);
            } else {
                System.out.println("the chest is limited to do the following");
            }
        } else if (status == ChestStates.UNLOCKED) {
            if (action == ChestAction.LOCK) {
                status = ChestStates.LOCKED;
                System.out.println("The chest is now " + status);
            } else if (action == ChestAction.OPEN) {
                status = ChestStates.OPEN;
                System.out.println("The chest is now " + status);
            } else if (action == ChestAction.UNLOCK || action == ChestAction.CLOSE) {
                System.out.println("this action is not possible because it's " + status);
            } else {
                System.out.println("the chest is limited to do the following");
            }
        } else if (status == ChestStates.OPEN) {
            if (action == ChestAction.CLOSE) {
                status = ChestStates.UNLOCKED;
                System.out.println("The chest is now " + status);
            } else if (action == ChestAction.OPEN || action == ChestAction.UNLOCK || action == ChestAction.LOCK) {
                System.out.println("this action is not possible because it's " + status);
            } else {
                System.out.println("the chest is limited to do the following");
            }
        }

    }

}
