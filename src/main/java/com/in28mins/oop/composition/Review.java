package com.in28mins.oop.composition;

public class Review {

    private int id;
    private String description;
    private int rate;

    public Review(int id, String description, int rate) {
        this.id = id;
        this.description = description;
        this.rate = rate;
    }

    public String toString(){

        return id+ " "+ description +" "+ rate;
    }
}
