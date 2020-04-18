package com.company.lesson9;

public class TikTest {

    public static void main(String[] args) throws InterruptedException {

        TikTak clock = new TikTak();
        clock.start();

        Thread.sleep(5000);
        clock.interrupt();

    }


    public static class TikTak extends Thread {

        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Tik");
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }


}
