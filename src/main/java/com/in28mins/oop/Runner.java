package com.in28mins.oop;

public class Runner {
    public static void main(String[] args) {

        MotorBike ace = new MotorBike();
        MotorBike bravo = new MotorBike();

        // get ace speed
        // increase it by 100
        // set it to ace

        ace.increaseSpeed(100);
        bravo.increaseSpeed(200);

        ace.decreaseSpeed(30);
        bravo.decreaseSpeed(330);

        System.out.println(ace.getSpeed());
        System.out.println(bravo.getSpeed());
    }
}
