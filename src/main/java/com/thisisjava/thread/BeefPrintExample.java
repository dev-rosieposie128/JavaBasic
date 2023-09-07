package com.thisisjava.thread;

import java.awt.*;

public class BeefPrintExample {

    // 메인 스레드만 이용하는 경우
    // 0.5초 주기로 비프음을 발생시키면서 동시에 프린팅하는 작업이 있다고 가정
    public static void main(String[] args){
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i=0; i<5; i++){
            // 비프음 발생
            toolkit.beep();
            try{
                // 0.5초간 일시정지
                Thread.sleep(500);
            }catch (Exception e){}
        }

        for(int i=0; i<5; i++){
            System.out.println("띵");
            try{
                // 0.5초간 일시정지
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
