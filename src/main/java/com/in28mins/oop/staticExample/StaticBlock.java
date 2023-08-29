package com.in28mins.oop.staticExample;

public class StaticBlock {
    static int data=1;
    public StaticBlock(){
        System.out.println("StaticBlock 생성자");
    }

    static {
        System.out.println("1. static 블록");
        data=3;
    }

    static {
        System.out.println("2. static 블록");
        data=5;
    }

    public static int getData(){
        return data;
    }
}
