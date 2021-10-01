package ru.mirea.task4;

public class Author {
    private final String name;
    private String email;
    private final char gender;

    public Author (String name, String email, char gender){
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String toString(){
        return "Author {name='" + this.name + "'" + ", email='" + this.email + "', gender='" + this.gender +"'}";
    }
}
