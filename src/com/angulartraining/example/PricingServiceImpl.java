package com.angulartraining.example;

public class PricingServiceImpl implements PricingService {

    private DataAccess dataAccess;

    public void setDataAccess(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getPrice(String sku) throws SkuNotFoundException {
        final int price = this.dataAccess.getPriceBySku(sku);
        if (price == 0) {
            throw new SkuNotFoundException();
        }
        return price;
    }

    public boolean isDataAccessSetup() {
        return  this.dataAccess != null;
    }
}
