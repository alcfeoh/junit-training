package com.angulartraining.cart;

public class LicensePlate {

    Double price;
    String title;
    String description;
    String image;

    public Double getDiscountedPrice() {
        return price * 0.8;
    }

}
