package com.in28mins.oop.abstractExample1;

public class Recipe1 extends AbstractRecipe{

    Recipe1(){
        super();
        System.out.println("나는 recipe1의 생성자");
    }

    @Override
    void getReady() {
        System.out.println("get the raw mateials");
        System.out.println("get the raw utensils ");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
    }

    @Override
    void cleanup() {
        System.out.println("cleanup the utensils");
    }

    void test(){
        System.out.println("test");
    }
}
