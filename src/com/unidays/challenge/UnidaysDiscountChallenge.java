package com.unidays.challenge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * UnidaysDiscountChallenge is used to hold Shop items and do calculations with it.
 *
 * @author  Sepehr Naseri
 * @version 1.0
 * @since    2020-02-20
 */
public class UnidaysDiscountChallenge {

    private ArrayList<ShopItem> basket = new ArrayList<>();
    private final double deliveryCharge = 7.00;
    private final double freeDeliveryPrice= 50.00;

    /**
     * @param ShopItem to be added.
     */
    public void AddToBasket(ShopItem item) {
        basket.add(item);
    }

    /**
     * @return the total price (including delievery) of all ShopItems held by this object.
     */
    public double CalculateTotalPrice() {

        double discount = this.getDiscount();

        double totalPrice = 0.00;
        for (ShopItem item: basket) {
            totalPrice = item.getPrice() + totalPrice;
        }
        totalPrice = totalPrice - discount;

        if (totalPrice >= freeDeliveryPrice || totalPrice <= 0){
            System.out.println("This order is over 50£ and hence it is eligible for free delivery");
            System.out.println("Delivery Charge = £" + 0.00);
            System.out.println("Total price including delivery = £ " + totalPrice);
            return totalPrice;
        } else {
            System.out.println("This order is under 50£ and hence not eligible for free delivery");
            System.out.println("Delivery Charge = £" + deliveryCharge);
            System.out.println("Total price including delivery = £ " + totalPrice);
            return (totalPrice + deliveryCharge);
        }
    }

    /**
     * @return return the amount of discount eligible for all items in basket.
     */
    public double getDiscount() {
        double discountAmount = 0.0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        //a Counter to see how many of each item type is held in the basket
        for (ShopItem item: basket) {
            switch(item.getDiscountType()) {
                case "B":
                    b = b +1;
                    break;
                case "C":
                    c = c +1;
                    break;
                case "D":
                    d = d +1;
                    break;
                case "E":
                    e = e + 1;
                    break;
            }
        }
        //only dividing by 2 as the division only returns the integer part of the value
        //for example if only 1 item = b / 2 = 0
        discountAmount = discountAmount + ((b / 2) * 4);

        //3 for 10£
        if (c%3 == 1) {
            c--;
            discountAmount = discountAmount + ((c/3) * 2);
        } else if (c%3 == 2) {
            c = c-2;
            discountAmount = discountAmount +  ((c/3) * 2);
        } else {
            discountAmount = discountAmount +  ((c/3) * 2);
        }

        //Buy one get one free
        discountAmount = discountAmount + ((d/2) * 7);

        //3 for the price of 2
        if (e%3 == 1) {
            e--;
            discountAmount = discountAmount + ((e/3) * 5);
        } else if (e%3 == 2) {
            e = e-2;
            discountAmount = discountAmount +  ((e/3) * 5);
        } else {
            discountAmount = discountAmount +  ((e/3) * 5);
        }

        return discountAmount;
    }


    /**
     * Clears all the ShopItems held by this object
     */
    public void clearBasket() {
        basket.clear();
    }

    /**
     * Adds more than one ShopItem at once
     */
    public void addMultipleToBasket(List<ShopItem> toAdd) {
        basket.addAll(toAdd);
    }
}
