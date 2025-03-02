package org.sudosurya.threadSynchronisation;

public class SyncWIthLockDemo {

    private static int counter1= 0;
    private static int counter2= 0;

    public static final Object  lock1 = new Object();
    public static final Object  lock2 = new Object();

    private static void increamentLock1(){
        synchronized (lock1){
            counter1++;
        }

    }
    private static void increamentLock2(){
        synchronized (lock2){
            counter2++;
        }
    }
    public static void main(String[] args) {

        Thread one = new Thread(()->{
            for (int i = 0; i < 100002; i++) {
                System.out.println("THREAD ONE");
                increamentLock1();
            }
        });
        Thread two = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                System.out.println("THREAD TWO");
                increamentLock2();
            }
        });

        one.start();
        two.start();

        try {
            one.join();
            two.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("COUNTER-> "+counter1 + " Counter2 " + counter2);
    }
}
