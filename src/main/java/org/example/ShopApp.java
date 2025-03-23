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
        while (true) {
            printProductList();
            System.out.print("제품 번호를 입력 하세요(결제:c, 종료:q): ");
            String input = scan.nextLine();

            if (input.equals("q")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (input.equals("c")) {
                proceedToPayment();
                break;
            }

            addItemInCart(input);
        }
    }

    public void addItemInCart(String itemId) {
        try {
            int id = Integer.parseInt(itemId);
            Product product = ProductRepo.getProduct(id);
            if (product != null) {
                cart.add(id);
                System.out.println(product.getName() + "이 장바구니에 추가되었습니다.");
            } else {
                System.out.println("유효하지 않은 제품 번호입니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다.");
        }
    }

    public void printProductList() {
        System.out.println("# 상품 목록");
        System.out.println("================================");
        for (var entry : ProductRepo.findAll()) {
            Product product = entry.getValue();
            System.out.println("[" + entry.getKey() + "] " + product);
        }
        System.out.println("--------------------------------");
    }

    private void proceedToPayment() {
        int totalPrice = 0;
        System.out.println("# 장바구니 목록 #");
        System.out.println("================================");
        for (Product product : cart.getProductList()) {
            System.out.println(product);
            totalPrice += product.getPrice();
        }
        System.out.println("================================");
        System.out.println(">>>> " + totalPrice + " 결제를 진행할까요? (y/n): ");
        String choice = scan.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            System.out.println(">>>> 결제가 완료 되었습니다!! ");
        } else {
            System.out.println(">>>> 결제를 취소했습니다.");
        }
    }
}