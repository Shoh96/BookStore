package com.andy;

/**
 * Created by Chama on 1/8/2018.
 */
public class BookStoreTester {
    public static void main(String[] args) {

        BookStore me = new BookStore(5000, 3);


        System.out.println("Number of Books: " + me.getNo_Books());

        System.out.printf("Total book price", me.getTotalBookPrice());

        System.out.println("Total Order Price: " + me.orderPrice());


    }

}


