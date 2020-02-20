package com.unidays.challenge;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UnidaysDiscountChallenge {

    private ArrayList<ShopItem> basket = new ArrayList<>();

    public void AddToBasket(ShopItem item) {
        basket.add(item);
    }

    public double CalculateTotalPrice() {
        double totalPrice = 0.00;
        for (ShopItem item: basket) {
            totalPrice = item.getPrice() + totalPrice;
        }
        return totalPrice;
    }
}
