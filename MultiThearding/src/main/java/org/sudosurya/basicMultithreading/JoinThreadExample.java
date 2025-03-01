package org.sudosurya.basicMultithreading;

public class JoinThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread one: " + i);
            }
        });

        Thread two = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread two: " + i);
            }
        });

        one.start();
        two.start();
        one.join();
        System.out.println("Done executing the threads");
    }

}
