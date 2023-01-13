package org.example.lesson26Cuncurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        AtomicInteger atomicInteger2 = new AtomicInteger(5);

        atomicInteger.set(atomicInteger.get() + atomicInteger2.get());
        atomicInteger.addAndGet(-3);
        System.out.println(atomicInteger);
    }
}
