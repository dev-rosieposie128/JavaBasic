package com.in28mins.oop.abstractExample2;

public class Dog extends Animal{

    private String name = "강아지";
    @Override
    public void bark() {
        System.out.println("나는 "+name+" 몽몽몽");
    }

}
