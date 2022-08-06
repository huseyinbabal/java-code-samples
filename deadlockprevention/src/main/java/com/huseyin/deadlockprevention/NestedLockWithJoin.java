package com.huseyin.deadlockprevention;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NestedLockWithJoin {

    public static void main(String[] args) throws InterruptedException {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService();

        Thread thread1 = new Thread(() -> {
            synchronized (orderService) {
                log.info("Locked orderService");
                orderService.create(12);
                try {
                    Thread.sleep(400);
                }
                catch (InterruptedException e) {
                    log.error("interrupted", e);
                }
                synchronized (paymentService) {
                    log.info("Locked paymentService");
                    paymentService.pay(4);
                    try {
                        Thread.sleep(400);
                    }
                    catch (InterruptedException e) {
                        log.error("interrupted", e);
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (paymentService) {
                log.info("Locked orderService");
                paymentService.pay(4);
                try {
                    Thread.sleep(400);
                }
                catch (InterruptedException e) {
                    log.error("interrupted", e);
                }
                synchronized (orderService) {
                    log.info("Locked orderService");
                    orderService.update(1, "SUCCESS");
                    try {
                        Thread.sleep(400);
                    }
                    catch (InterruptedException e) {
                        log.error("interrupted", e);
                    }
                }
            }

        });
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
    }
}
