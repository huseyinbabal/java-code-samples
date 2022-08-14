package com.huseyin.heapdumpanalysis;

import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HeapDump {

    public static void main(String[] args) throws InterruptedException {

        int count = Integer.parseInt(args[0]);
        int waitTime = Integer.parseInt(args[1]);
        log.info("Loading products...");
        List<String> products = new ProductCatalogService().getProducts(count);
        log.info("{} products are loaded into memory.", products.size());
        Thread.sleep(waitTime * 1000L);
    }
}
