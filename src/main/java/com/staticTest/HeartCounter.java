package com.staticTest;

import java.util.HashMap;
import java.util.Map;

public class HeartCounter {
    static int count;

    public HeartCounter(){
        count++;
        System.out.println("좋아요 개수 ="+count);
    }
    public static int getCount(){
        return count;
    }

    public static void main(String[] args){
        HeartCounter hc1 = new HeartCounter();
        HeartCounter hc2 = new HeartCounter();

        System.out.println("총 좋아요 개수 from main= "+HeartCounter.getCount());

        System.out.println(MathUtils.add(1,2));
    }
}
