package com.thread2;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    // 계산기에 값을 저장하는 메소드
    public void setMemory(int memory) {

        synchronized (this){
            this.memory = memory;
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            System.out.println(Thread.currentThread().getName() +": "+this.memory);
        }
    }
}
