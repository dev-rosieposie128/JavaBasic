package com.thisisjava.thread;

public class ConsumerThread extends Thread{
    private DataBox dataBox;

    // 공유 객체를 필드에 저장
    public ConsumerThread(DataBox dataBox) {
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for(int i=0; i<=3; i++){
            String data = dataBox.getData();
        }
    }
}
