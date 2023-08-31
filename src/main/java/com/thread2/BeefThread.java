package com.thread2;

import java.awt.*;

public class BeefThread extends Thread{
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++){
            try{
                // 0.5초간 일시정지
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
