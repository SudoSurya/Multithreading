package org.sudosurya.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorDemo {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            for (int i = 0; i < 5; i++) {
                service.execute(new Task(i));

            }
        }
        System.out.println("----FIXED THREAD POOL EXECUTOR-----");
        try (ExecutorService service = Executors.newFixedThreadPool(6)) {
            for (int i = 0; i < 15; i++) {
                service.execute(new Task(i));

            }
        }
    }
}

class Task implements Runnable{

    private final int workId;

    public Task(int workId) {
        this.workId = workId;
    }

    @Override
    public void run() {
        System.out.println("WorkId " + workId + "Executed by " + Thread.currentThread().getName());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}