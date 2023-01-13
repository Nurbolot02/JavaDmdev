package org.example.lesson28;

public class ReflectionExample {
    public static void main(String[] args) {
        User user = new User(1L, "Nurbolot", User.Gender.M);
        Class<? extends User> aClass = user.getClass();
        System.out.println();
    }
}
