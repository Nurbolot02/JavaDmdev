package org.example.lesson28;

public class User extends Person {
    private Gender gender;
    public User(long id, String name, Gender gender) {
        super(id, name);
        this.gender = gender;
    }

    static enum Gender{
        M, F
    }
}
