package com.huseyin.deadlock;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadsWithoutSynchronization {

    public static void main(String[] args) throws InterruptedException {
        StockCounter stockCounter = new DefaultStockCounter();
        Discounter2 discounter21 = new Discounter2(stockCounter);
        Discounter2 discounter22 = new Discounter2(stockCounter);
        Discounter3 discounter31 = new Discounter3(stockCounter);
        Discounter3 discounter32 = new Discounter3(stockCounter);
        discounter21.start();
        discounter22.start();
        discounter31.start();
        discounter32.start();

        // wait for all the threads finishes their tasks.
        discounter21.join();
        discounter22.join();
        discounter31.join();
        discounter32.join();
        log.info("Final stock count is {}", stockCounter.getCount());
    }
}
