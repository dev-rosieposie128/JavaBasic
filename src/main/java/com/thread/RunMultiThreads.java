package com.thread;

public class RunMultiThreads {

    public static void main(String[] args){
        RunMultiThreads rm = new RunMultiThreads();
        rm.runMultiThreads();
    }
    public void runMultiThreads() {
        RunnableSample[] runnable = new RunnableSample[5];
        ThreadSample[] thread = new ThreadSample[5];

        for (int i = 0; i < 5; i++) {
            runnable[i] = new RunnableSample();
            thread[i] = new ThreadSample();

            new Thread(runnable[i]).start();
            thread[i].start();
        }
        System.out.println("RunMultiThreads.runMultiThread() method is ended");
    }
}
