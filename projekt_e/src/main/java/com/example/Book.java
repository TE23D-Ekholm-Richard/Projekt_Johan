package com.example;

public class Book extends Library {
    private String author;
    private String genre;
    private int pages;

    public Book(int id, String titel, boolean isAvailable, String author, String genre, int pages){
        super(id,titel,isAvailable);
        this.author=author;
        this.genre=genre;
        this.pages=pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", genre=" + genre + ", pages=" + pages + "]";
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
