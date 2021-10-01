package ru.mirea.task3;

public class Book {
    private int pages;
    private String author;
    private String genre;

    public Book(int pages, String author, String genre){
        this.author=author;
        this.genre=genre;
        this.pages=pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString(){
        return "Book {pages='" + this.pages + "'" + ", author='" + this.author + "', genre='" + this.genre +"'}";
    }
}
