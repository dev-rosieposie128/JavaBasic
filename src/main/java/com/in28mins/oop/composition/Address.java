package com.in28mins.oop.composition;

public class Address {

    private String line1;
    private String city;
    private String zip;

    //creation
    public Address(String line1, String city, String zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    //what are not essentials, we would probably create a settters for that.
    // in this example, we assumed everything is important, now, you'd want to allow modifications of a line1, city, or zip
    // i think i would not want to allow modifications, if somebody wants to update the address, they can create a new address object and
    // set it as the address to the customer

    public String toString(){
        return line1 +" " + city + " "+zip;
    }
}
