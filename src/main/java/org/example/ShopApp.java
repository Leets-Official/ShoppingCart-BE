package org.example;

import java.util.List;
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

        while (true) {
            String input = scan.next();
            if (input.equals("q")) { // 'q' 입력 시 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (input.equals("c")) { // 'c' 입력 시 장바구니 목록 출력
                System.out.println("# 장바구니 목록 #");
                System.out.println("================================");
                List<Product> productList = cart.getProductList();

                long amount = 0;
                for (Product product : productList) {
                    System.out.println(product);
                    amount += product.getPrice();
                }
                System.out.print(">>>> " + amount + " 결제를 진행할까요? (y/n): ");

                String pay = scan.next();
                if (pay.equals("y")) {
                    System.out.println(">>>> 결제가 완료 되었습니다!!");
                    break;
                } else {
                    printProductList();
                }
            } else { // 해당 상품 담기
                addItemInCart(input);
                printProductList();
            }
        }
    }

    public void addItemInCart(String item) {
        //TODO: 구현
        cart.add(Integer.parseInt(item));
    }

    public void printProductList() {
        //TODO: 구현
        System.out.println("# 상품 목록");
        System.out.println("================================");
        for (Map.Entry<Integer, Product> entry : ProductRepo.findAll()) {
            System.out.println("[" + entry.getKey() + "] " + entry.getValue());
        }
        System.out.println("--------------------------------");
        System.out.print("제품 번호를 입력 하세요(결제:c, 종료:q): ");
    }
}
