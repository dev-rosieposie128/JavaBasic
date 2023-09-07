package com.thisisjava.thread;

public class PrintThread1 extends Thread{
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop){
            // 스레드 반복 실행 코드
            System.out.println("실행 중");
        }
        // 스레드가 사용한 자원 정리
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
