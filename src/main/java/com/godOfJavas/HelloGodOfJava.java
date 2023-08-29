package com.godOfJavas;

public class HelloGodOfJava {

    public static void main(String[] args){

        HelloGodOfJava h = new HelloGodOfJava();
        h.catchNull();
    }

    public void catchNull() {

        int[] intarr = new int[5];

        try {
            intarr = null;
            System.out.println(intarr[5]);

        //} catch (NullPointerException e) {
        //    System.out.println("null e");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arrout e");
        } catch (Exception e) {
            System.out.println(intarr);
        }
    }
}
