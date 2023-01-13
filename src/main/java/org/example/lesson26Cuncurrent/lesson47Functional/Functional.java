package org.example.lesson26Cuncurrent.lesson47Functional;

import java.util.*;

public class Functional {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            integers.add(random.nextInt(1000));
        }

        integers = integers.stream()
                .sorted()
                .toList();

        System.out.println(integers);

        Optional<Integer> min = integers.stream()
                .min(Integer::compare);

        Optional<Integer> max = integers.stream()
                .max(Integer::compare);

        System.out.printf("min: %d \nmax: %d\n", min.orElse(-1), max.orElse(-1));
    }
}
