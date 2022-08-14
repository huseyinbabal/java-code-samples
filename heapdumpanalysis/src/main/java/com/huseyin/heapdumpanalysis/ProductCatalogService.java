package com.huseyin.heapdumpanalysis;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

public class ProductCatalogService {

    public List<String> getProducts(int limit) {
        List<String> products = new ArrayList<>();
        for (int i = 0; i< limit; i++){
            products.add(new String(new char[1024*1000]));
        }
        return products;
    }
}
