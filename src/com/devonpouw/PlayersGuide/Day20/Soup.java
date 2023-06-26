package com.devonpouw.PlayersGuide.Day20;

public class Soup {
    private final FoodType type;
    private final MainIngredient mainIngredient;
    private final Seasoning seasoning;

    public Soup(FoodType type, MainIngredient mainIngredient, Seasoning seasoning) {
        this.type = type;
        this.mainIngredient = mainIngredient;
        this.seasoning = seasoning;
    }

    public FoodType getType() {
        return type;
    }


    public MainIngredient getMainIngredient() {
        return mainIngredient;
    }


    public Seasoning getSeasoning() {
        return seasoning;
    }
}

enum FoodType {
    SOUP,
    STEW,
    GUMBO
}

enum MainIngredient {
    MUSHROOMS,
    CHICKEN,
    CARROTS,
    POTATOES
}

enum Seasoning {
    SPICY,
    SALTY,
    SWEET
}

