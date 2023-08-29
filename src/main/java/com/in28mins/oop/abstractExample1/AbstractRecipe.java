package com.in28mins.oop.abstractExample1;

public abstract class AbstractRecipe{
    // 1.prepare
    // 2.recipe
    // 3.cleanup

    AbstractRecipe(){
        System.out.println("나는 abstractRecipe의 생성자");
    }


    public void execute(){
        getReady();
        doTheDish();
        cleanup();
    }

    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanup();


}