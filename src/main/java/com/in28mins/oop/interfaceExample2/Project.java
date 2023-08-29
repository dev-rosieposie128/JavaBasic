package com.in28mins.oop.interfaceExample2;

public class Project {

    public static void main(String[] args){

        ComplexAlgorithm dummyAlgorithm = new DummyAlgorithm();
        ComplexAlgorithm realAlgorithm = new RealAlgorithm();

        System.out.println(dummyAlgorithm.complexAlgorithm(10,20));
        System.out.println(realAlgorithm.complexAlgorithm(10,20));
    }
}
