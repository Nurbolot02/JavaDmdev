package org.example.lesson26Cuncurrent.lesson47Functional;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        int size = 10;
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            integers.add(random.nextInt(100));
        }

        OptionalDouble average = integers.stream()
                .filter(v1 -> v1 % 2 != 0 && v1 % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();

        average.ifPresentOrElse(System.out::println, () -> System.out.println("not found!"));
    }
}
