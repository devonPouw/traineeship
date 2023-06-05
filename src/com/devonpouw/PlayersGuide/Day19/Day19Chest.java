package com.devonpouw.PlayersGuide.Day19;


public class Day19Chest {
    private ChestStates status;

    public Day19Chest(ChestStates chest) {
        status = chest;
    }

    public String getStatus() {
        return "The chest is currently: " + status;
    }

    public void setStatus(String choice) {
        if (status == ChestStates.LOCKED) {
            if (choice.equalsIgnoreCase("unlock")) {
                status = ChestStates.UNLOCKED;
                System.out.println("The chest is now " + status);
            } else if (choice.equalsIgnoreCase("lock") || choice.equalsIgnoreCase("close") || choice.equalsIgnoreCase("open")) {
                System.out.println("this action is not possible because it's " + status);
            } else {
                System.out.println("the chest is limited to do the following");
            }
        } else if (status == ChestStates.UNLOCKED) {
            if (choice.equalsIgnoreCase("lock")) {
                status = ChestStates.LOCKED;
                System.out.println("The chest is now " + status);
            } else if (choice.equalsIgnoreCase("open")) {
                status = ChestStates.OPEN;
                System.out.println("The chest is now " + status);
            } else if (choice.equalsIgnoreCase("unlock") || choice.equalsIgnoreCase("close")) {
                System.out.println("this action is not possible because it's " + status);
            } else {
                System.out.println("the chest is limited to do the following");
            }
        } else if (status == ChestStates.OPEN) {
            if (choice.equalsIgnoreCase("close")) {
                status = ChestStates.UNLOCKED;
                System.out.println("The chest is now " + status);
            } else if (choice.equalsIgnoreCase("open") || choice.equalsIgnoreCase("unlock") || choice.equalsIgnoreCase("lock")) {
                System.out.println("this action is not possible because it's " + status);
            } else {
                System.out.println("the chest is limited to do the following");
            }
        }

    }


}
