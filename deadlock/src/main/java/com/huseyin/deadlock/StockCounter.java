package com.huseyin.deadlock;

public interface StockCounter {
    void decrease(int amount);
    int getCount();
}
