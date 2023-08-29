package com.in28mins.oop.composition;

public class FanRunner {

    public static void main(String[] args){
        Fan fan = new Fan("Manufacturer 1", 0.34567, "GREEN");
        //fan.isOn(false);
        fan.switchOn();
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
