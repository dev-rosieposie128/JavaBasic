package com.in28mins.oop.polymorphism;

public class Penguin extends Animal2{
    public String habitat;

    public void showHabitat(){
        System.out.printf("%s는 %s에 살아\n", animalName, habitat);
    }

    @Override
    public void showName() {
        System.out.println("내 이름은 알아서 뭐하시게요!");
    }

    public void showName(String yourName){
        System.out.printf("%s 안녕, 나는 %s라고 해 \n", yourName, animalName);
    }
}
