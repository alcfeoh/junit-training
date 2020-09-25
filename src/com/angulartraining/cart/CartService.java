package com.angulartraining.cart;

public class CartService {

    private IDatabase database;

    public CartService(IDatabase db){
        database = db;
    }

    public LicensePlate[] getCartContents() {
        return database.getCartContents();
    }

    public Integer getNumberOfItemsInCart() {
        return database.getCartContents().length;
    }

    public void addPlateToCart(LicensePlate licensePlate) {
        database.addPlateToCart(licensePlate);
    }


    public boolean removePlateFormCart(LicensePlate licensePlate) {
        return database.removePlateFormCart(licensePlate);
    }
}
