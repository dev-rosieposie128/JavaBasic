package com.in28mins.oop.abstractExample1;

public class RecipeWithMicrowave extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("get the raw mateials");
        System.out.println("switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("get stuff ready");
        System.out.println("put it in the microwave");
    }

    @Override
    void cleanup() {
        System.out.println("cleanup the utensils");
        System.out.println("switch off the microwave");
    }
}
