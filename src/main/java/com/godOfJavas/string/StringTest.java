package com.godOfJavas.string;

public class StringTest {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String [] args){

        String a = "rose";
        StringBuffer b = new StringBuffer("rose");
        StringBuilder c = new StringBuilder("rose");

        System.out.println(a + " " + System.identityHashCode(a)); //문자열과 메모리 주소 출력
        a = a+"2";
        a = a+"3";
        System.out.println(a + " " + System.identityHashCode(a));

        System.out.println(b + " " + System.identityHashCode(b)); //문자열과 메모리 주소 출력
        b.append("2");
        b.append("3"); //문자열 추가
        System.out.println(b + " " + System.identityHashCode(b));

        System.out.println(c + " " + System.identityHashCode(c)); //문자열과 메모리 주소 출력
        c.append("2");
        c.append("3"); //문자열 추가
        System.out.println(c + " " + System.identityHashCode(c));



    }
}
