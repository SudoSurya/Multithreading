package org.sudosurya.basicMultithreading;

public class RunnableThreadExample {

    public static void main(String[] args) {
        Thread one = new Thread(new ThreadOne());
        Thread two = new Thread(new ThreadTwo());

        Thread three = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread three: " + i);
            }
        });
        one.start();
        two.start();
        three.start();
    }

    private static class ThreadOne implements Runnable {
        @Override
        public void run() {

        }
    }

    private static class ThreadTwo implements Runnable {
        @Override
        public void run() {

        }
    }
}

