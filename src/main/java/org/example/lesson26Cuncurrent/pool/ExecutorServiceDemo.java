package org.example.lesson26Cuncurrent.pool;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                Random random = new Random();
                for (int j = 0; j < 10_000_000; j++) {
                    copyOnWriteArrayList.add(random.nextInt(50_000_000));
                }
            });
        }

        executorService.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println();
    }
}
