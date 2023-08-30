package com.enumTest;

public class EnumDriver {

    public static void main(String[] args){

        // 변수 선언시
        Week tomorrow;
        Week reservationDay;

        // 열거 변수에 열거 상수 저장하기
        Week today = Week.THURSDAY;
        // name() 열거 객체가 가진 문자열 리턴
        String name = today.name();
        System.out.println(name);

        // ordinal() 열거 객체 중 몇 번째 열거 객체인지 알려준다
        int ordinal = today.ordinal();
        System.out.println(ordinal);

        // 참조 타입이므로 null 저장 가능
        Week birthday = null;

        Week day1 = Week.MONDAY;
        Week day2 = Week.SATURDAY;

        System.out.println(day1==day2);
        // compareTo() 매개값으로 주어진 열거 객체를 기준으로 전후로 몇 번째 위치하는지를 비교 - 상대적 위치를 비교
        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);
        System.out.println(result1);
        System.out.println(result2);

        // valueOf() 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴한다.
        Week weekDay = Week.valueOf("MONDAY");
        System.out.println(weekDay);
        System.out.println(day1 == weekDay);

        // values() 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체 리턴
        Week[] days = Week.values();
        for(Week day : days){
            System.out.println(day);
        }
/*
        for (Week day : days) {
            System.out.println(day.korean + " (" + day.chinese + ")");
        }

        Week.SATURDAY.korean = "변경된다";
        System.out.println(Week.SATURDAY.korean);*/

        for (Week day : days) {
            System.out.println(day.getKorean() + " (" + day.getChinese() + ")");
        }

        System.out.println(Week.SATURDAY.getKorean());

    }
}
