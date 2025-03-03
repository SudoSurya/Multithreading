package org.sudosurya.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadExecutorDemo {
    public static void main(String[] args) {
        System.out.println("----FIXED THREAD POOL EXECUTOR-----");
        try (ExecutorService service = Executors.newFixedThreadPool(6)) {
            for (int i = 0; i < 15; i++) {
                service.execute(new Task(i));

            }
        }
    }
}

