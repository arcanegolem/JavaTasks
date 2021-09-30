package ru.mirea.task2;

public class Book {
    private String pages;
    private String author;
    private String genre;

    public Book(String pages, String author, String genre){
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

    public String getPages() {
        return pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String toString(){
        return "Book {pages='" + this.pages + "'" + ", author='" + this.author + "', genre= '" + this.genre +"}";
    }
}
