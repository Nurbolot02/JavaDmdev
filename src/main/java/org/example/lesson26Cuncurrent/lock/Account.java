package org.example.lesson26Cuncurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private final Lock lock = new ReentrantLock();
    private Integer money;
    private String name;

    public Account(Integer money, String name) {
        this.money = money;
        this.name = name;
    }

    public void addMoney(int money){
        this.money += money;
    }

    public Lock getLock() {
        return lock;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
