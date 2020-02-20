package com.unidays.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ShopItem A = new ShopItem("A", 8.0, "A"); //No discount
        ShopItem B = new ShopItem("B", 12.0, "B"); //2 for 20£
        ShopItem C = new ShopItem("C", 4.0, "C"); //3 for 10£
        ShopItem D = new ShopItem("D", 7.0, "D"); //Buy one get one free
        ShopItem E = new ShopItem("E", 5.0, "E"); //3 for the price of 2

        UnidaysDiscountChallenge unidaysDiscountChallenge = new UnidaysDiscountChallenge();

        System.out.println("Here are all the test example cases listed performed for proof: ");
        //All the example test cases that are given on the website https://github.com/MyUNiDAYS/tech-placement-challenge
        //Example  - None -
        System.out.println("_________________________________________________________________");
        System.out.println("Example - None");
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 1 - A -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 1 - A");
        unidaysDiscountChallenge.AddToBasket(A);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 2 - B
        System.out.println("_________________________________________________________________");
        System.out.println("Example 2 - B");
        unidaysDiscountChallenge.AddToBasket(B);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 3 - C
        System.out.println("_________________________________________________________________");
        System.out.println("Example 3 - C");
        unidaysDiscountChallenge.AddToBasket(C);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 4 - D -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 4 - D");
        unidaysDiscountChallenge.AddToBasket(D);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 5 - E -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 5 - E");
        unidaysDiscountChallenge.AddToBasket(E);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 6 - BB -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 7 - BB");
        List<ShopItem> toAdd = Arrays.asList(B,B);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 7 - BBB -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 7 - BBB");
        List<ShopItem> toAdd1 = Arrays.asList(B,B,B);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd1);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 8 - BBBB -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 8 - BBBB");
        List<ShopItem> toAdd2 = Arrays.asList(B,B,B,B);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd2);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 9 - CCC -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 9 - CCC");
        List<ShopItem> toAdd3 = Arrays.asList(C,C,C);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd3);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 10 - CCCC -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 12 - CCCC");
        List<ShopItem> toAdd4 = Arrays.asList(C,C,C,C);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd4);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 11 - DD -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 11 - DD");
        List<ShopItem> toAdd5 = Arrays.asList(D,D);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd5);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 12 - EEE -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 12 - DDD");
        List<ShopItem> toAdd6 = Arrays.asList(D,D,D);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd6);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 13 - EE -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 13 - EE");
        List<ShopItem> toAdd7 = Arrays.asList(E,E);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd7);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 14 - EEE -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 17 - EEE");
        List<ShopItem> toAdd8 = Arrays.asList(E,E,E);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd8);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        System.out.println("_________________________________________________________________");
        //Example 15 - EEEE -
        System.out.println("Example 18 - EEEE");
        List<ShopItem> toAdd9 = Arrays.asList(E, E, E, E);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd9);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 17 - DDDDDDDDDDDDDD -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 17 - DDDDDDDDDDDDDD");
        List<ShopItem> toAdd10 = Arrays.asList(D, D, D, D, D, D, D, D, D, D, D, D, D, D);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd10);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        System.out.println("_________________________________________________________________");
        //Example 18 - BBBBCCC -
        System.out.println("Example 18 - BBBBCCC");
        List<ShopItem> toAdd11 = Arrays.asList(B, B, B, B, C, C, C);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd11);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        //Example 19 - ABBCCCDDEE -
        System.out.println("_________________________________________________________________");
        System.out.println("Example 19 - ABBCCCDDEE");
        List<ShopItem> toAdd12 = Arrays.asList(A, B, B, C, C, C, D, D, E, E);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd12);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
        System.out.println("_________________________________________________________________");
        //Example 20 - EDCBAEDCBC -
        System.out.println("Example 20 - EDCBAEDCBC");
        List<ShopItem> toAdd13 = Arrays.asList(E, D, C, B, A, E, D, C, B, C);
        unidaysDiscountChallenge.addMultipleToBasket(toAdd13);
        unidaysDiscountChallenge.CalculateTotalPrice();
        unidaysDiscountChallenge.clearBasket();
    }
}
