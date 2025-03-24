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
        while (true) {
            printProductList();
            System.out.print("제품 번호를 입력 하세요(결제:c, 종료:q): ");
            String input = scan.nextLine();

            if (input.equals("q")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (input.equals("c")) {
                System.out.println("# 장바구니 목록 #");
                System.out.println("================================");
                for (Product product : cart.getProductList()) {
                    System.out.println(product);
                }
                int total = cart.getTotalPrice();
                System.out.printf(">>>> %d 결제를 진행할까요? (y/n): ", total);
                String yn = scan.nextLine();
                if (yn.equals("y")) {
                    System.out.println(">>>> 결제가 완료 되었습니다!!");
                    break;
                }
            } else {
                addItemInCart(input);
            }
        }
    }

    public void addItemInCart(String item) {
        try {
            int pid = Integer.parseInt(item);
            if (ProductRepo.getProduct(pid) != null) {
                cart.add(pid);
            }
        } catch (NumberFormatException e) {
            System.out.println("잘못된 입력입니다.");
        }
    }

    public void printProductList() {
        for (Map.Entry<Integer, Product> entry : ProductRepo.findAll()) {
            System.out.printf("[%d] %s\n", entry.getKey(), entry.getValue());
        }
    }
}