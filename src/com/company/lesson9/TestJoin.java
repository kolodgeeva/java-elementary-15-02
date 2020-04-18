package com.company.lesson9;

public class TestJoin {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new MyThread("thread1");
        Thread thread2 = new MyThread("thread2");

        thread1.start();

        thread1.join();

        System.out.println("sleep in main 1000");
        Thread.sleep(1000);

        thread2.start();

        thread2.join();

        System.out.println("main");

    }

}
