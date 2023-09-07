package com.thisisjava.thread;

public class StopFlagExample {
    public static void main(String[] args){
        PrintThread1 printThread1 = new PrintThread1();
        printThread1.start();

        try{
            printThread1.sleep(100);
        }catch (InterruptedException e){
        }
        // 스레드를 종료시키기 위해 stop 필드를 true 로 변경
        printThread1.setStop(true);
    }
}
