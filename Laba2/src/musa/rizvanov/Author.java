package musa.rizvanov;
import java.lang.*;

public class Author {
    private String Name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        Name = name;
        this.email = email;
        this.gender = gender;
    }


    //Геттеры и Сеттеры
    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }
    //toString()
    @Override
    public String toString() {
        return (Name + " (" + gender + ") at " + email);
    }
}
