package com.thread2;

import java.awt.*;

public class BeefPrintExample3 {

    // 메인 스레드만 이용하는 경우
    // 0.5초 주기로 비프음을 발생시키면서 동시에 프린팅하는 작업이 있다고 가정
    public static void main(String[] args){

        /* 1.첫번째 방법
        Thread thread = new BeefThread();
         */

        /* 2.두번째 방법 */
        Thread thread = new Thread(){
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
        };
        thread.start();

        for(int i=0; i<5; i++){
            System.out.println("띵");
            try{
                // 0.5초간 일시정지
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
