package com.company.lesson9;

import java.util.ArrayList;

public class Names  {

    private String name1 = "Оля";
    private String name2 = "Лена";

    public synchronized void swap() {
        String s = name1;
        name1 = name2;
        name2 = s;
    }

    public static Names names = new Names();

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Thread thread1 = new MyThread();
            thread1.start();
            threads.add(thread1);
        }


        for (Thread thread: threads) {
            thread.join();
        }

        System.out.println(names.name1);
        System.out.println(names.name2);

    }


    public static class MyThread extends Thread {

        @Override
        public void run() {
            names.swap();
        }
    }
}
