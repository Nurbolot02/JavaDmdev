package org.example.lesson26Cuncurrent.pool;

import java.util.Optional;
import java.util.Queue;

public class ThreadPool extends Thread {
    private final Queue<Runnable> tasks;

    public ThreadPool(Queue<Runnable> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Runnable task){
        tasks.add(task);
    }

    @Override
    public void run() {
        while (true){
            Optional<Runnable> task = Optional.empty();
            synchronized (tasks){
                if (!tasks.isEmpty()){
                    task = Optional.of(tasks.remove());
                }
            }
            task.ifPresent(Runnable::run);
        }
    }
}
