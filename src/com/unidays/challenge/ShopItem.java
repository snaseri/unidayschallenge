package com.unidays.challenge;

public class ShopItem {

    private String name;
    private double price;
    private String discountType;

    public ShopItem(String name, double price, String discountType) {
        this.name = name;
        this.price = price;
        this.discountType = discountType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDiscountType() {
        return discountType;
    }

}
