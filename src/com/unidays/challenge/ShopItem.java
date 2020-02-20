package com.unidays.challenge;

public class ShopItem {

    private String name;
    private double price;
    private String discountType;

    /**
     * ShopItem is used to represent an item with price and discount types.
     *
     * @author  Sepehr Naseri
     * @version 1.0
     * @since   2019-11-19
     */
    public ShopItem(String name, double price, String discountType) {
        this.name = name;
        this.price = price;
        this.discountType = discountType;
    }

    /**
     * @return name of the course.
     */
    public String getName() {
        return name;
    }

    /**
     * @return name of the course.
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return name of the course.
     */
    public String getDiscountType() {
        return discountType;
    }

}
