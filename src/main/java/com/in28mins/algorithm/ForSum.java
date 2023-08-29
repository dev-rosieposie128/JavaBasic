package com.in28mins.algorithm;

import java.util.Scanner;

public class ForSum {

   public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 값 :");
        int a = stdIn.nextInt();

        do{
            System.out.println("양의 정수를 입력해주세요!");
            a = stdIn.nextInt();
        }while(a<=0);
        int len = String.valueOf(a).length();

        System.out.println("그 수는 "+len+"자리입니다");
    }
}
