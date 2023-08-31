package com.thread2;

import java.awt.*;

public class BeefPrintExample2 {

    // 메인 스레드만 이용하는 경우
    // 0.5초 주기로 비프음을 발생시키면서 동시에 프린팅하는 작업이 있다고 가정
    public static void main(String[] args){

        /*
        1. 첫번째 방법
        Runnable beefTask = new BeefTask();
        Thread thread = new Thread(beefTask);
        thread.start();*/

        /*2. 두번째 방법
        Thread thread = new Thread(new Runnable() {
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
        });*/

        // 3. 세번째 방법 - 람다식 사용
        Thread thread = new Thread(()->{
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i=0; i<5; i++){
                try{
                    // 0.5초간 일시정지
                    Thread.sleep(500);
                }catch (Exception e){}
            }
        });

        for(int i=0; i<5; i++){
            System.out.println("띵");
            try{
                // 0.5초간 일시정지
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
