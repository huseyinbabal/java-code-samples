package com.huseyin.deadlockprevention;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
class PaymentService {

    private int balance = 0;

    public void pay(int amount) {
        this.balance =- amount;
    }
}

