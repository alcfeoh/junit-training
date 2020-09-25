package com.angulartraining.cart;

public interface IDatabase {
    LicensePlate[] getCartContents();
    void addPlateToCart(LicensePlate licensePlate);
    boolean removePlateFormCart(LicensePlate licensePlate);
}
