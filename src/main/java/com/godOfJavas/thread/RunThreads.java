package com.godOfJavas.thread;

public class RunThreads {

    public static void main(String[] args){
        RunThreads threads = new RunThreads();
        //threads.runCommonThread();
        threads.runBasic();
    }
    private void runBasic() {

        EndlessThread et = new EndlessThread();
        et.start();

       /* NameCalcThread nct = new NameCalcThread("daseul", 1);
        nct.start();

        RunnableSample rs = new RunnableSample();
        new Thread(rs).start();

        ThreadSample ts = new ThreadSample();
        ts.start();
        System.out.println("RunThreads.runBasic() method is ended");*/
    }
    public void runCommonThread(){
        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true);
        dt.start();
    }
}
