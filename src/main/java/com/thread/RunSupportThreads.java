package com.thread;

public class RunSupportThreads {
    public static void main(String[] args){
        RunSupportThreads rst = new RunSupportThreads();
        rst.checkThreadState1();
        //rst.checkJoin();
    }
    public void checkThreadState1() {
        SleepThread thread = new SleepThread(2000);

        try {

            System.out.println("thread state=" + thread.getState());
            thread.start();
            System.out.println("thread state(after state)=" + thread.getState());


            Thread.sleep(1000);
            System.out.println("thread state(after 1sec)=" + thread.getState());

            thread.join();
            thread.interrupt();
            System.out.println("thread state(after join)="+thread.getState());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void checkJoin(){
        SleepThread st = new SleepThread(2000);

        try{
            st.start();
            st.join(2200);
            st.interrupt();
            System.out.println("thread state(after join)="+st.getState());

            System.out.println(st.isInterrupted());
            System.out.println(Thread.interrupted());
            System.out.println(Thread.activeCount());
            System.out.println(Thread.currentThread());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
