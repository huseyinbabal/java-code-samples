package com.huseyin.deadlock;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadsDeadlock {

    public static void main(String[] args) throws InterruptedException {
        StockCounter stockCounter1 = new DefaultStockCounter();
        StockCounter stockCounter2 = new DefaultStockCounter();

        Thread thread1 = new Thread(() -> {
            synchronized (stockCounter1) {
                log.info("Locked stockCounter1");
                try {
                    Thread.sleep(400);
                }
                catch (InterruptedException e) {
                    log.error("interrupted", e);
                }
                synchronized (stockCounter2) {
                    log.info("Locked stockCounter2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (stockCounter2) {
                log.info("Locked stockCounter2");
                try {
                    Thread.sleep(400);
                }
                catch (InterruptedException e) {
                    log.error("interrupted", e);
                }
                synchronized (stockCounter1) {
                    log.info("Locked stockCounter1");
                }
            }
        });
        thread1.start();
        thread2.start();

    }
}
