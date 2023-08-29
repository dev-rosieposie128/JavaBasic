package com.in28mins.oop.polymorphism;

public class Driver {
    public static void main(String[] args){
        Penguin pororo = new Penguin();

        pororo.animalName="뽀로로";
        pororo.habitat="남극";

        pororo.showName();
        pororo.showName("초보람보");
        pororo.showHabitat();

        Animal2 pingu = new Penguin();

        pingu.animalName="핑구";
        pingu.showName();
    }
}
