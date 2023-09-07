package com.thisisjava.thread;

public class ThreadD extends Thread{
    public boolean stop = false;    // 종료 플래그
    public boolean work = true;     // 작업 진행 여부 플래그

    public void run() {

        // stop이 true 되면 종료
        while(!stop){
            if(work){
                System.out.println("Thread D 작업내용");
            }else{
                // work가 false되면 다른 스레드에게 실행 양보
                Thread.yield();
            }
        }
        System.out.println("Thread D 종료");
    }
}
