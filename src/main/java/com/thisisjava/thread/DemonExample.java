package com.thisisjava.thread;

public class DemonExample {
    public static void main(String[] args){
        AutoSavaThread autoSavaThread = new AutoSavaThread();
        autoSavaThread.setDaemon(true);
        autoSavaThread.start();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
        System.out.println("메인 스레드 종료");
    }
}
