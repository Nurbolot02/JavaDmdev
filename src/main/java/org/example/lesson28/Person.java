package org.example.lesson28;

import java.io.Serializable;

public class Person implements Serializable, Comparable<Person> {
    private long id;
    private String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Person(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
