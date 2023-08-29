package com.in28mins.oop.inheritance;

public class Student extends Person{

    private String collegeName;
    private int year;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +

                "name='" + getName() + '\'' +
                "email='" + getEmail() + '\'' +
                "collegeName='" + collegeName + '\'' +
                ", year=" + year +
                '}';
    }
}
