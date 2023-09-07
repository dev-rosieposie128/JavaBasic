package com.godOfJavas.string;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EqualsHashcodeTest {

    public static void main(String [] args){

        // 객체 생성
        String txt1 = new String("kim");
        String txt2 = new String("kim");
        String txt5 = new String("daseul");
        String txt6 = new String("daseul");

        // 스트링 풀 - 리터럴로 생성
        String txt3 = "kim";
        String txt4 = "kim";

        System.out.println((txt1).equals(txt3));    // true
        System.out.println(txt1 == txt3);           // false

        System.out.println((txt1).equals(txt2));    // true
        System.out.println(txt1 == txt2);           // false

        System.out.println((txt3).equals(txt4));    // true
        System.out.println(txt3 == txt4);           // true

        System.out.println("txt1 hashcode :" +txt1.hashCode());
        System.out.println("txt2 hashcode :" +txt2.hashCode());
        System.out.println("txt3 hashcode :" +txt3.hashCode());
        System.out.println("txt4 hashcode :" +txt4.hashCode());
        System.out.println("txt5 hashcode :" +txt5.hashCode());
        System.out.println("txt6 hashcode :" +txt5.hashCode());


        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Date();

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));

        System.out.println("obj1 hashcode :"+obj1.hashCode());
        System.out.println("obj2 hashcode :"+obj2.hashCode());

        System.out.println("obj1 toString() :"+obj1.toString());
        System.out.println("obj2 toString() :"+obj2.toString());
        System.out.println("obj3 toString() :"+obj3.toString());

    }
}
