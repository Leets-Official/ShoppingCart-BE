package org.example;

import java.util.Map;
import java.util.Scanner;

import static org.example.ProductRepo.findAll;

public class ShopApp {
    Scanner scan;
    Cart cart;

    public ShopApp() {
        scan = new Scanner(System.in);
        cart = new Cart();

        ProductRepo.init();
    }

    public void start() {
        while (true){
            printProductList();
            System.out.println("제품 번호를 입력 하세요(결제:c, 종료:q): ");
            String op = scan.nextLine();
            
            //결제
            if (op.equalsIgnoreCase("c")){

                //장바구니 목록 출력 및 결제할 총 가격 계산
                System.out.println("# 장바구니 목록 #");
                System.out.println("================================");
                int priceSum = 0;
                for (Product product : cart.getProductList()){
                    System.out.println(product);
                    priceSum += product.getPrice();
                }

                //결제 진행
                while (true){
                    System.out.printf(">>>> %d 결제를 진행할까요? (y/n): ", priceSum);
                    op = scan.nextLine();
                    if (op.equalsIgnoreCase("y")){
                        System.out.println(">>>> 결제가 완료 되었습니다!!");
                        return;
                    } else if (op.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }
            //종료
            else if (op.equalsIgnoreCase("q")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            //장바구니에 상품 추가
            else {
                addItemInCart(op);
            }
        }
    }

    public void addItemInCart(String item) {
        cart.add(Integer.parseInt(item));
    }

    public void printProductList() {
        System.out.println("# 상품 목록");
        System.out.println("================================");
        for (Map.Entry<Integer, Product> entry : findAll()) {
            System.out.printf("[%d] %s\n", entry.getKey(), entry.getValue().toString());
        }
        System.out.println("--------------------------------");
    }
}
