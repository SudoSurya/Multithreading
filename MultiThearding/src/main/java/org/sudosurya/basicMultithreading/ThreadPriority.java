package org.sudosurya.basicMultithreading;

public class ThreadPriority {
    public static void main(String[] args) {

        Thread threadOne = new Thread(()->{
            for (int i = 0; i < 50; i++) {
                System.out.println("HIGH");
            }
        });


        Thread threadTwo = new Thread(()->{
            for (int i = 0; i < 50; i++) {
                System.out.println("LOW");
            }
        });

        threadOne.start();
        threadTwo.start();

        threadOne.setPriority(Thread.MAX_PRIORITY);
        threadTwo.setPriority(Thread.MIN_PRIORITY);
    }
}


