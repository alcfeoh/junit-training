package com.angulartraining.cart;

public class Database implements IDatabase {

    @Override
    public LicensePlate[] getCartContents() {
        throw new UnsupportedOperationException("Database not available");
    }

    @Override
    public void addPlateToCart(LicensePlate licensePlate) {
        throw new UnsupportedOperationException("Database not available");
    }

    @Override
    public boolean removePlateFormCart(LicensePlate licensePlate) {
        throw new UnsupportedOperationException("Database not available");
    }
}
