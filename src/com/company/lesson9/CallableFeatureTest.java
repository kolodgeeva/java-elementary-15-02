package com.company.lesson9;

import java.util.concurrent.*;

public class CallableFeatureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<String> task = new MyCallable();
        FutureTask<String> future = new FutureTask<>(task);
        new Thread(future).start();

        String result = future.get();
        System.out.println(result);


        ExecutorService executor = Executors.newFixedThreadPool(2);

        MyCallable task1 = new MyCallable();
        Future<String> future1 = executor.submit(task1);

        MyCallable task2 = new MyCallable();
        Future<String> future2 = executor.submit(task2);

        Thread.sleep(5000);

        String string = future1.get();
        System.out.println(string);

    }


    public static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "Hello World!";
        }
    }

}
