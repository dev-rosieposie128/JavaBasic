package com.thisisjava.thread;

public class ThreadE extends Thread{

    private WorkObject workObject;

    // 공유 객체를 매개값으로 받아 필드에 저장
    public ThreadE(WorkObject workObject) {
        this.workObject = workObject;
    }

    @Override
    public void run() {
        // 공유 객체의 methodE를 10번 반복 호출
        for(int i=0; i<10; i++){
            workObject.methodE();
        }
    }
}
