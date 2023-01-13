package org.example.lesson26Cuncurrent.pool;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        scheduledExecutorService.schedule(()-> System.out.println("Hello "), 1L, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(()-> {
            Random random = new Random();
            System.out.printf("Hello %d\n", random.nextInt(100)); },
                4L, 2, TimeUnit.SECONDS);
    }
}
