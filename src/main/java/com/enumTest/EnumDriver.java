package com.enumTest;

public class EnumDriver {

    public static void main(String[] args){

        // 변수 선언시
        Week today;
        Week reservationDay;

        // 열거 변수에 열거 상수 저장하기
        Week tomorrow = Week.THURSDAY;

        // 참조 타입이므로 null 저장 가능
        Week birthday = null;

        Week week1 = Week.SATURDAY;
        Week week2 = Week.SATURDAY;

        System.out.println(week1==week2);
    }
}
