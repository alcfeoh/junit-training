package com.angulartraining.example;



public class LocalDataAccess implements DataAccess {

    public Integer getPriceBySku(String sku) {
        if ("21".equals(sku)) {
            return 450;
        } else {
            return null;
        }
    }
}
