package org.example;

import java.util.Map;
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
        printProductList();
    }

    public void addItemInCart(String item) {
        //TODO: 구현
    }

    public void printProductList() {
        //TODO: 구현
        System.out.println("# 상품 목록");
        System.out.println("================================");
        for (Map.Entry<Integer, Product> entry : ProductRepo.findAll()) {
            System.out.println("[" + entry.getKey() + "] " + entry.getValue());
        }
        System.out.println("--------------------------------");
    }
}
