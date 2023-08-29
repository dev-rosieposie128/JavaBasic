package com.godOfJavas;

import javax.sound.midi.Soundbank;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte age){
        this.age = age;
    }

    public void setMarried(boolean flag){
        this.isMarried = flag;
    }

    public void setName(String name){
        this.name = name;
    }

    public byte getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public Boolean getIsMarried(){
        return isMarried;
    }

    public static void main(String[] args){
        ProfilePrint pp = new ProfilePrint();
        pp.setAge((byte) 30);
        pp.setName("kim rose");
        pp.setMarried(false);

        System.out.println(pp.getAge());
        System.out.println(pp.getName());
        System.out.println(pp.getIsMarried());
    }
}
