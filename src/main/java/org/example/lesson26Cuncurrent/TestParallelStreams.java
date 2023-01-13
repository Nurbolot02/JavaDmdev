package org.example.lesson26Cuncurrent;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestParallelStreams {
    public static void main(String[] args) {
        //ConcurrentHashMap<Integer, Integer> hashMap = new ConcurrentHashMap<>(Integer.MAX_VALUE);
        HashMap<Integer, Integer> hashMap = new HashMap<>(Integer.MAX_VALUE);

        long startM = System.nanoTime();

//        for (int i = 2; i < 5; i++) {
//            int start = count * (i - 1);
//            int end = count * i;
//            executorService.submit(
//                    () -> {
//                        for (int j = start; j < end; j++) {
//                            hashMap.put(j, j);
//                        }
//                    }
//            );
//        }
        new Thread(() -> {
            for (int j = 0; j < 1000; j++) {
                hashMap.put(j, j);
            }
        }).start();
        new Thread(() -> {
            for (int j = 1000; j < 2000; j++) {
                hashMap.put(j, j);
            }
        }).start();


        for (int j = 2000; j <= 3000; j++) {
            hashMap.put(j, j);
        }

        long endM = System.nanoTime();
        System.out.println(endM -startM);

    }
}
