package com.huseyin.deadlockprevention;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Data
class OrderService {

    private int stockCount = 0;
    private Map<Integer, String> orderStatuses = new HashMap<>();

    public void create(int quantity) {
        this.stockCount =- quantity;
    }

    public void update(int i, String status) {
        orderStatuses.put(i, status);
    }
}

