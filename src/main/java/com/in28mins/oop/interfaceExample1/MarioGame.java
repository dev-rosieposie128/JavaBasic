package com.in28mins.oop.interfaceExample1;

public class MarioGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("jump");
    }

    @Override
    public void down() {
        System.out.println("goes into a hole");
    }

    @Override
    public void left() {
    }

    @Override
    public void right() {
        System.out.println("go forward");
    }
}
