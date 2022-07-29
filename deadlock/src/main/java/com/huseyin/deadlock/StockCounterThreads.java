package com.huseyin.deadlock;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Discounter2 extends Thread {
    StockCounter stockCounter;
    Discounter2(StockCounter t) {
        super("discounter-2");
        this.stockCounter = t;
    }

    public void run(){
        stockCounter.decrease(2);
    }
}

@Slf4j
class Discounter3 extends Thread {
    StockCounter stockCounter;
    Discounter3(StockCounter t) {
        super("discounter-3");
        this.stockCounter = t;
    }

    public void run(){
        stockCounter.decrease(3);
    }
}
