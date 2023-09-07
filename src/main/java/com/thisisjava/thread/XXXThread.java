package com.thisisjava.thread;

public class XXXThread extends Thread{
    private boolean stop;

    @Override
    public void run() {
        while (!stop){
            // 스레드 반복 실행 코드
        }
        // 스레드가 사용한 자원 정리
    }
}
