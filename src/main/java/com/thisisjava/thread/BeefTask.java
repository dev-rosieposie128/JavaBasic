package com.thisisjava.thread;

import java.awt.*;

public class BeefTask implements Runnable{

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
