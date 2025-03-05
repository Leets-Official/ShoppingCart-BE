package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShopAppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void 앱을_실행하면_상품목록을_출력한다() {

        ByteArrayInputStream in = new ByteArrayInputStream("q\n".getBytes());
        System.setIn(in);

        new ShopApp().start();

        String output = outContent.toString();
        assertTrue(output.contains("[1187] 구글 픽셀 5, carrier: LG U+ : 900000\n"
                + "[228] LG 그램, cpu: Intel core i7 : 1500000\n"
                + "[101] 삼성 갤럭시 노트북, cpu: Intel core i9 : 1200000\n"
                + "[2311] Apple 맥북, cpu: Intel core i5 : 2000000\n"
                + "[8638] 삼성 갤럭시 S10, carrier: SKT : 1000000\n"
                + "[238] Apple 아이폰 15, carrier: KT : 1500000\n"));
        assertTrue(output.contains("프로그램을 종료합니다."));
    }

    @Test
    void 상품을_선택하면_올바른_데이터가_카트에_들어간다() {

        ShopApp shopApp = new ShopApp();
        shopApp.addItemInCart("101");

        assertEquals("삼성 갤럭시 노트북", shopApp.cart.getProductList().get(0).getName());
    }

    @Test
    void 전체_기능_테스트() {
        ByteArrayInputStream in = new ByteArrayInputStream("1187\n228\nc\ny\n".getBytes());
        System.setIn(in);

        new ShopApp().start();

        String output = outContent.toString();
        assertTrue(output.contains("구글 픽셀 5, carrier: LG U+ : 900000"));
        assertTrue(output.contains("LG 그램, cpu: Intel core i7 : 1500000"));
        assertTrue(output.contains("2400000"));
    }
}