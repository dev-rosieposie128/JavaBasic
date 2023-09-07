package com.thisisjava.thread;

public class WaitNotifyExample {
    public static void main(String[] args){
        WorkObject workObject = new WorkObject();

        ThreadE threadE = new ThreadE(workObject);
        ThreadF threadF = new ThreadF(workObject);

        threadE.start();
        threadF.start();
    }
}
