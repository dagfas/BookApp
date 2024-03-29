package com.company;

public class Book {

    private String title;
    private String author;
    private String description;
    private int price;
    private boolean isInStock;

    //Default constructor
    public Book(){
    }

    //Overloaded constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void getDisplayText(){
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
