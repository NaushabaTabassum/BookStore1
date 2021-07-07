package com.example.BookStore.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book {

    @Id
    private int id;
    private String titleName;
    private String author;
    private int pages_length;
    private double price;

    public Book() {
    }

    public Book(int id, String title, String author, int pages_length, double price) {
        this.id = id;
        this.titleName = title;
        this.author = author;
        this.pages_length = pages_length;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages_length() {
        return pages_length;
    }

    public void setPages_length(int pages_length) {
        this.pages_length = pages_length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", titleName='" + titleName + '\'' +
                ", author='" + author + '\'' +
                ", pages_length=" + pages_length +
                ", price=" + price +
                '}';
    }
}
