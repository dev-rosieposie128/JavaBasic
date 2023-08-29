package com.in28mins.oop.composition;

public class Fan {

    //state (3 important things when you create a fan)
    private String make;
    private double radius;
    private String color;

    // less important than 3 things above when you create a fan
    private boolean isOn;
    private byte speed; //0 to 5

    //creation - this would ensure that anybody who's creating Fan objet would pass in this value
    Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

//    public void isOn(boolean isOn){
//        this.isOn = isOn;
//    }

    public void switchOn() {
        this.isOn = true;
        setSpeed((byte) 5);
    }

    public void switchOff() {
        this.isOn = false;
        setSpeed((byte) 0);
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    //print the state
    public String toString() {
        return String.format("make - %s, radius -%f, color - %s, isOn - %b, speed - %d",
                make, radius, color, isOn, speed);
    }
}

