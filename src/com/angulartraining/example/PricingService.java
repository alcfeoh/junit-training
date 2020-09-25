package com.angulartraining.example;

public interface PricingService {

    void setDataAccess(DataAccess dataAccess);
    int getPrice(String sku) throws SkuNotFoundException;
}
