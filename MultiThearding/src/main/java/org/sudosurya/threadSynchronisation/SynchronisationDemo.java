package org.sudosurya.threadSynchronisation;

public class SynchronisationDemo {
    private static int counter = 0;

    private static int counter1= 0;
    private static int counter2= 0;



    private static synchronized void increament (){
        counter++;
    }
    private static synchronized void increament1(){
        counter1++;
    }
    private static synchronized void increament2(){
        counter2++;
    }


    public static void main(String[] args) {

        Thread one = new Thread(()->{
            for (int i = 0; i < 100002; i++) {
                System.out.println("THREAD ONE");
                increament1();
            }
        });
        Thread two = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                System.out.println("THREAD TWO");
                increament2();
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
