package com.in28mins.oop.staticExample;

public class StaticBlockCheck {
    public static void main(String[] args){
        StaticBlockCheck check = new StaticBlockCheck();
        check.makeStaticBlockObject();
    }
    public void makeStaticBlockObject() {
        System.out.println("creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("create block1");
        System.out.println("------------------");
        System.out.println("creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("create block2");
    }
}
