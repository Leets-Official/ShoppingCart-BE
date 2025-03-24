package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> productList = new ArrayList<>();

    void add(int pid) {
        Product product = ProductRepo.getProduct(pid);
        if (product != null) {
            productList.add(product);
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public int getTotalPrice() {
        return productList.stream().mapToInt(Product::getPrice).sum();
    }
}
