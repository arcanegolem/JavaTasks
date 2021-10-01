package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args){
        Book test_book = new Book (122, "Some Author", "Sci-Fi");

        System.out.println(test_book.getAuthor());
        System.out.println(test_book.getGenre());
        System.out.println(test_book.getPages());
        System.out.println(test_book);

        test_book.setAuthor("New Author");
        test_book.setGenre("Adventure");
        test_book.setPages(220);
        System.out.println(test_book);
    }
}
