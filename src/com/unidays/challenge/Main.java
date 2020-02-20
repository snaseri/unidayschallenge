package com.unidays.challenge;

public class Main {

    public static void main(String[] args) {

        ShopItem A = new ShopItem("A", 8.0); //No discount
        ShopItem B = new ShopItem("B", 12.0); //2 for 20£
        ShopItem C = new ShopItem("C", 4.0); //3 for 10£
        ShopItem D = new ShopItem("D", 7.0); //Buy one get one free
        ShopItem E = new ShopItem("E", 5.0); //3 for the price of 2

        ShopItem item = new ShopItem("Pizza", 10.50);
        UnidaysDiscountChallenge unidaysDiscountChallenge = new UnidaysDiscountChallenge();

        System.out.println("Total price is " + unidaysDiscountChallenge.CalculateTotalPrice());
	// write your code here
    }
}
