package com.example.bookapp;

public class Book {
    private String bookName, authorName;
    private Integer bookImage;

    public Book(String bookName, String authorName, Integer bookImage) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookImage = bookImage;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getBookImage() {
        return bookImage;
    }

    public void setBookImage(Integer bookImage) {
        this.bookImage = bookImage;
    }
}
