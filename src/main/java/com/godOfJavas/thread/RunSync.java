package com.godOfJavas.thread;

public class RunSync {
    public static void main(String[] args){
        RunSync rs = new RunSync();
        for(int loop=0; loop < 5; loop++){
            rs.runCommonCalculate();
        }
    }
    public void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate();
        ModifyAmountThread mat1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread mat2 = new ModifyAmountThread(calc, true);

        mat1.start();
        mat2.start();

        try{
            mat1.join();
            mat2.join();
            System.out.println("final value is  "+calc.getAmount());

        }catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}
