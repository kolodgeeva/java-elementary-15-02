package com.company.lesson9;

public class Main {

    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);

        Thread thread1 = new MyThread("my new thread");

        thread.start();
        thread1.start();

        System.out.println("main: " + Thread.currentThread().getName());
        System.out.println("main: " + thread.getName());
        System.out.println("main: " + thread1.getName());

        System.out.println("Main 1");
        System.out.println("Main 2");

    }
}
