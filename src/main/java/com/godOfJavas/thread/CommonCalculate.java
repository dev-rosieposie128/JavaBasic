package com.godOfJavas.thread;

public class CommonCalculate {
    private int amount;

    public CommonCalculate(){
        amount = 0;
    }
    /*public void plus(int value){
        synchronized(this){
            amount += value;
        }
    }
    public void minus(int value){
        synchronized(this){
            amount -= value;
        }
    }*/

    Object lock = new Object();
    public void plus(int value) {
        synchronized (lock) {
            amount += value;
        }
    }
    public void minus(int value) {
        synchronized (lock) {
            amount -= value;
        }
    }
    public int getAmount(){
        return amount;
    }
}
