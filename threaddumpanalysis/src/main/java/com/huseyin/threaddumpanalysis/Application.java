package com.huseyin.threaddumpanalysis;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        int counter = 0;
        while (true) {
            executor.submit(newTask(counter));
            counter++;
            Thread.sleep(1000);
        }
    }

    private static Runnable newTask(int i) {
        return () -> log.info("Running task {}", i);
    }
}
