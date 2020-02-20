package com.unidays.challenge;

public class Main {

    public static void main(String[] args) {

        ShopItem item = new ShopItem("Pizza", 10.50);
        UnidaysDiscountChallenge unidaysDiscountChallenge = new UnidaysDiscountChallenge();

        unidaysDiscountChallenge.AddToBasket(item);
        unidaysDiscountChallenge.AddToBasket(item);
        unidaysDiscountChallenge.AddToBasket(item);
        unidaysDiscountChallenge.AddToBasket(item);

        System.out.println(unidaysDiscountChallenge.CalculateTotalPrice());
	// write your code here
    }
}
