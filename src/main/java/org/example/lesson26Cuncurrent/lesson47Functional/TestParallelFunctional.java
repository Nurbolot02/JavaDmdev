package org.example.lesson26Cuncurrent.lesson47Functional;

import java.util.*;
import java.util.concurrent.*;

public class TestParallelFunctional {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        ConcurrentLinkedQueue<User> finalUsers1 = new ConcurrentLinkedQueue<>();

        finalUsers1 = new ConcurrentLinkedQueue<>();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        ConcurrentLinkedQueue<User> finalUsers = finalUsers1;

        long start = System.currentTimeMillis();

        for (int i = 0; i < 3; i++) {
            executorService.submit(()-> {
                for (int j = 0; j < 10_000_000; j++) {
                    finalUsers.add(new User(String.valueOf(random.nextInt(500, 30_000_00)), random.nextInt(100)));
                }
            });
        }

        executorService.awaitTermination(1, TimeUnit.MINUTES);
        long end = System.currentTimeMillis();
        System.out.printf("Parallel Create time: %s\n", end - start);


        start = System.currentTimeMillis();
        for (int i = 0; i < 30_000_000; i++) {
            finalUsers1.add(new User(String.valueOf(random.nextInt(500, 30_000_000)), random.nextInt(100)));
        }
        end = System.currentTimeMillis();

        System.out.printf("Create time: %s\n", end - start);



        start = System.currentTimeMillis();
        List<User> users2 = finalUsers1.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();
        end = System.currentTimeMillis();
        System.out.printf("sort time: %s\n", end - start);

        start = System.currentTimeMillis();
        List<User> users1 = finalUsers1.stream()
                .parallel()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();
        end = System.currentTimeMillis();
        System.out.printf("Parallel sort time: %s\n", end - start);

        System.out.println();

    }
}
