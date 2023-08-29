package com.thread;

import java.sql.SQLOutput;

public class RunObjectThreads {

    public static void main(String[] args){
        RunObjectThreads rot = new RunObjectThreads();
        rot.checkThreadState2();
    }

    public void checkThreadState2() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);

        try{
            System.out.println("thread state="+thread.getState());
            thread.start();
            System.out.println("thread state(after start)="+thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1sec)="+thread.getState());

            synchronized (monitor){
                monitor.notify();
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify)="+thread.getState());

            thread.join();
            System.out.println("thread state(after join)="+thread.getState());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
