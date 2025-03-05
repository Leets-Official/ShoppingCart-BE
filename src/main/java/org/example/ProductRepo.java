package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductRepo {
    private static Map<Integer, Product> productList = new HashMap<Integer, Product>();

    public static void init() {
        productList.put(101,new Computer("삼성 갤럭시 노트북", 1200000, "Intel core i9"));
        productList.put(228,new Computer("LG 그램", 1500000, "Intel core i7"));
        productList.put(2311, new Computer("Apple 맥북", 2000000, "Intel core i5"));
        productList.put(8638, new SmartPhone("삼성 갤럭시 S10", 1000000, "SKT"));
        productList.put(238, new SmartPhone("Apple 아이폰 15", 1500000, "KT"));
        productList.put(1187,new SmartPhone("구글 픽셀 5", 900000, "LG U+"));
    }

    //TODO: 모든 상품 목록을 반환하는 메서드
    public static Set<Map.Entry<Integer,Product>> findAll() {
        return null;
    }

    //TODO: pid로 product를 가져오는 메서드
    public static Product getProduct(int pid) {
        return null;
    }
}
