package com.in28mins.oop.composition;

public class CustomerRunner {

    public static void main(String[] args){

        Address homeAdress = new Address("flat 1004", "Seoul", "111-222");
        Customer customer = new Customer("rosie", homeAdress);
        System.out.println(customer);

        Address workAdress = new Address("work 999", "Seoul", "111-333");
        customer.setWorkAddress(workAdress);
        System.out.println(customer);
    }

}
