package org.example.java17_features;

import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorFactoryTest {
    public static void main(String[] args) {
        RandomGeneratorFactory.getDefault().create().ints(10000, 0, 1000)
                .sorted()
                .forEach(System.out::println);
    }
}
