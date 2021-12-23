package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args){
        Author test = new Author("Test Name", "email@post.net", 'M');

        System.out.println(test.getName());
        System.out.println(test.getEmail());
        System.out.println(test.getGender());

        test.setEmail("new@post.net");

        System.out.println("upd email: " + test.getEmail());
        System.out.println(test);
    }
}
