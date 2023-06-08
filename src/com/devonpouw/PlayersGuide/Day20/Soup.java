package com.devonpouw.PlayersGuide.Day20;

import java.util.Scanner;

public class Soup {

    private final FoodVariations.FoodType type;
    private final FoodVariations.MainIngredient mainIngredient;
    private final FoodVariations.Seasoning seasoning;

    public Soup(FoodVariations.FoodType type, FoodVariations.MainIngredient mainIngredient, FoodVariations.Seasoning seasoning) {
        this.type = type;
        this.mainIngredient = mainIngredient;
        this.seasoning = seasoning;
    }

    public FoodVariations.FoodType getType() {
        return type;
    }


    public FoodVariations.MainIngredient getMainIngredient() {
        return mainIngredient;
    }


    public FoodVariations.Seasoning getSeasoning() {
        return seasoning;
    }

    public static String soupMaker() {
        Scanner scanner = new Scanner(System.in);
        FoodVariations.FoodType selectedType;

        System.out.println("Select the type of soup:");
        for (FoodVariations.FoodType type : FoodVariations.FoodType.values()) {
            System.out.println(type.ordinal() + ". " + type);
        }
        int typeChoice = scanner.nextInt();
        selectedType = FoodVariations.FoodType.values()[typeChoice];

        System.out.println("Select the main ingredient:");
        for (FoodVariations.MainIngredient ingredient : FoodVariations.MainIngredient.values()) {
            System.out.println(ingredient.ordinal() + ". " + ingredient);
        }
        int ingredientChoice = scanner.nextInt();
        FoodVariations.MainIngredient selectedIngredient = FoodVariations.MainIngredient.values()[ingredientChoice];

        System.out.println("Select the seasoning:");
        for (FoodVariations.Seasoning seasoning : FoodVariations.Seasoning.values()) {
            System.out.println(seasoning.ordinal() + ". " + seasoning);
        }
        int seasoningChoice = scanner.nextInt();
        FoodVariations.Seasoning selectedSeasoning = FoodVariations.Seasoning.values()[seasoningChoice];

        Soup soup = new Soup(selectedType, selectedIngredient, selectedSeasoning);

        System.out.println("Your selected soup:");
        System.out.printf("%s %s %s", soup.getSeasoning(), soup.getMainIngredient(), soup.getType());

        return "\n\nEnjoy!";
    }

    public static void main(String[] args) {
        System.out.println(soupMaker());
    }
}
