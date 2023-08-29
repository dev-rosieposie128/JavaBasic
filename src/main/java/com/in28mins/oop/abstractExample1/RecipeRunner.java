package com.in28mins.oop.abstractExample1;

public class RecipeRunner {
    public static void main(String[] args){
        Recipe1 recipe = new Recipe1();
        recipe.execute();
        recipe.test();
        System.out.println("------------------");
        RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
        recipeWithMicrowave.execute();
    }
}
