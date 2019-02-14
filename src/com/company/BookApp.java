package com.company;

public class BookApp {

    public static void main(String[] args){
        Book book = new Book("Think and Grow Rich", "Napoleon Hill" );

        book.setAuthor("Napoleon Hill");
        book.setTitle("Think and Grow Rich");
        book.setDescription("Personal development and self-improvement book");


        book.getDisplayText();

    }
}
