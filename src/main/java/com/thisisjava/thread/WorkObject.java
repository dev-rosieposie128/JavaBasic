package com.thisisjava.thread;

public class WorkObject {
    public synchronized void methodE(){
        System.out.println("ThreadE의 methodE() 작업 실행");

        // 일시 정지 상태에 있는 ThreadF를 실행 대기 상태로 만듦
        notify();
        try {
            // ThreadE를 일시 정지 상태로 만듦
            wait();
        }catch (InterruptedException e){
        }
    }

    public synchronized void methodF(){
        System.out.println("ThreadF의 methodF() 작업 실행");

        // 일시 정지 상태에 있는 ThreadE를 실행 대기 상태로 만듦
        notify();
        try {

            // ThreadF를 일시 정지 상태로 만듦
            wait();
        }catch (InterruptedException e){
        }
    }
}
