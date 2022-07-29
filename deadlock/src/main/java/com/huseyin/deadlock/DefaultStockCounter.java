package com.huseyin.deadlock;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
class DefaultStockCounter implements StockCounter {

    private int count = 180;

    public void decrease(int amount) {
        int decreasedCount = count - amount;
        log.info("Current Count: {}, New Count: {}", count, decreasedCount);
        this.count = decreasedCount;
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            log.error("interrupted.", e);
        }
    }
}

