package com.thread;

public class RunDaemonThreads {

    public static void main(String args[]){
        RunDaemonThreads rdt = new RunDaemonThreads();
        rdt.checkThreadProperty();
    }

    private void checkThreadProperty() {

        ThreadSample ts1 = new ThreadSample();
        ThreadSample ts2 = new ThreadSample();
        ThreadSample deamonThread = new ThreadSample();

        System.out.println("thread1 id="+ts1.getId());
        System.out.println("thread2 id="+ts2.getId());

        System.out.println("thread name1="+ts1.getName());
        System.out.println("thread name2="+ts2.getName());

        System.out.println("thread1 priority="+ts1.getPriority());

        deamonThread.setDaemon(true);
        System.out.println("ts1 isDaemon="+ts1.isDaemon());
        System.out.println("deamonThread isDaemon="+deamonThread.isDaemon());
    }
}
