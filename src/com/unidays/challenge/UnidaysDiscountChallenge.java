package com.unidays.challenge;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UnidaysDiscountChallenge {

    private ArrayList<ShopItem> basket = new ArrayList<>();
    private final double deliveryCharge = 7.00;
    private final double freeDeliveryPrice= 50.00;

    public void AddToBasket(ShopItem item) {
        basket.add(item);
    }

    public double CalculateTotalPrice() {

        double discount = this.getDiscount();

        double totalPrice = 0.00;
        for (ShopItem item: basket) {
            totalPrice = item.getPrice() + totalPrice;
        }
        totalPrice = totalPrice - discount;

        if (totalPrice >= freeDeliveryPrice){
            System.out.println("This order is over 50£ and hence it is eligible for free delivery");
            System.out.println("Delivery Charge = £" + 0.00);
            return totalPrice - discount;
        } else {
            System.out.println("This order is under 50£ and hence not eligible for free delivery");
            System.out.println("Delivery Charge = £" + deliveryCharge);
            return (totalPrice + deliveryCharge);
        }
    }

    public double getDiscount() {
        double discountAmount = 0.0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        for (ShopItem item: basket) {
            switch(item.getName()) {
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

        System.out.println(discountAmount);
// 1 2
        return discountAmount;
    }
}
