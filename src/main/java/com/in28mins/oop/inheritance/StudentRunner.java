package com.in28mins.oop.inheritance;

public class StudentRunner {

    public static void main(String[] args){
        Student student = new Student();

        student.setCollegeName("dev univ");
        student.setYear(2);
        // person class의 메소드 바로 접근 가능
        student.setName("rosie");
        student.setEmail("rosiekim128@gmail.com");
        System.out.println(student);
    }
}
