package com.devonpouw.PlayersGuide.Day20;

import java.util.Scanner;

public class SoupMaker {

    public static String soupMaker() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the type of soup:");
        for (FoodType type : FoodType.values()) {
            System.out.println(type.ordinal() + ". " + type);
        }
        int typeChoice = scanner.nextInt();
        //todo: inputvalidatie
        //later: functie maken voor opvragen input uit een enum
        FoodType selectedType = FoodType.values()[typeChoice];

        System.out.println("Select the main ingredient:");
        for (MainIngredient ingredient : MainIngredient.values()) {
            System.out.println(ingredient.ordinal() + ". " + ingredient);
        }
        int ingredientChoice = scanner.nextInt();
        MainIngredient selectedIngredient = MainIngredient.values()[ingredientChoice];

        System.out.println("Select the seasoning:");
        for (Seasoning seasoning : Seasoning.values()) {
            System.out.println(seasoning.ordinal() + ". " + seasoning);
        }
        int seasoningChoice = scanner.nextInt();
        Seasoning selectedSeasoning = Seasoning.values()[seasoningChoice];

        Soup soup = new Soup(selectedType, selectedIngredient, selectedSeasoning);

        System.out.println("Your selected soup:");
        System.out.printf("%s %s %s", soup.getSeasoning(), soup.getMainIngredient(), soup.getType());

        return "\n\nEnjoy!!";
    }

    public static void main(String[] args) {
        System.out.println(soupMaker());
    }
}
