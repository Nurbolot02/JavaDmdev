package org.example.lesson26Cuncurrent.pool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        Queue<Runnable> tasks = new LinkedList<>();
        ThreadPool threadPool = new ThreadPool(tasks);
        Random random = new Random();
        threadPool.start();

        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            tasks.add(() -> System.out.println(random.nextInt(100)));
        }
        StringBuffer stringBuffer = new StringBuffer();


        threadPool.join();
    }
}
