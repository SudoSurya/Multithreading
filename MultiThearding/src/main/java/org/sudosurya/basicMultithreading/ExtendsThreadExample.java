package org.sudosurya.basicMultithreading;

public class ExtendsThreadExample {

    public static void main(String[] args) {

        threadone one = new threadone();
        ThreadTwo two = new ThreadTwo();

        one.start();
        two.start();
    }

    private static class ThreadTwo extends Thread{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread one: " + i);
            }
        }

    }
}

class threadone extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread one: " + i);
        }
    }

}
