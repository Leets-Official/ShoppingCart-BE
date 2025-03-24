package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> productList = new ArrayList<Product>();

    void add(int pid) {
        this.productList.add(ProductRepo.getProduct(pid));
    }

    public List<Product> getProductList() {
        return productList;

    }
}
