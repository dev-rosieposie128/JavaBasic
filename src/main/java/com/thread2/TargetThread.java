package com.thread2;

public class TargetThread extends Thread{

    public void run() {
        // 10억번 루핑 도는 동안 runnable 상태 유지
        for(long i=0; i<1000000000; i++){}

        try{
            //1.5초간 실행정지
            Thread.sleep(1500);
        }catch (Exception e){

        }
        // 10억번 루핑 도는 동안 runnable 상태 유지
        for(long i=0; i<1000000000; i++){}
    }
}
