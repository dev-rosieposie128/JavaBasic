package com.in28mins.oop.staticExample;

public class StaticTest {

    public static class StaticClassTest{
        static int classVar = 10;
        int instanceVar = 28;
    }

    public static void main(String[] args){
        StaticClassTest staticClassTest1 = new StaticClassTest();
        StaticClassTest staticClassTest2 = new StaticClassTest();

        System.out.println("1. "+staticClassTest1.classVar+", "+staticClassTest1.instanceVar);
        System.out.println("2. "+staticClassTest2.classVar+", "+staticClassTest2.instanceVar);

        staticClassTest1.classVar = 12;
        staticClassTest1.instanceVar = 40;

        System.out.println("1. "+staticClassTest1.classVar+", "+staticClassTest1.instanceVar);
        System.out.println("2. "+staticClassTest2.classVar+", "+staticClassTest2.instanceVar);

    }
}
