package org.example;

import java.util.Scanner;

public class ShopApp {
    Scanner scan;
    Cart cart;

    public ShopApp() {
        scan = new Scanner(System.in);
        cart = new Cart();

        ProductRepo.init();
    }

    public void start() {
        //TODO: 구현
    }

    public void addItemInCart(String item) {
        //TODO: 구현
    }

    public void printProductList() {
        //TODO: 구현
    }
}
