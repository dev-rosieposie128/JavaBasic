package com.in28mins.oop.composition;

public class BookRunner {

    public static void main(String[] args){
        Book book = new Book(1,"java with rosie","rosie kim");

        book.addReview(new Review(10, "excellent",10));
        book.addReview(new Review(11, "lovely",9));
        System.out.println(book);
    }
}
