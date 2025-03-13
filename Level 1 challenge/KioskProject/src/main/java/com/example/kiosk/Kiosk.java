package com.example.kiosk;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 속성 필드 캡슐화 적용
    private final List<Menu> menus;
    // 생성자
    public Kiosk() {
        menus = new ArrayList<>();
    }
    // 기능
    // 메뉴 카테고리에 추가
    public void addMenu(Menu menu) {
        menus.add(menu);
    }
    // 작동 시작.
    void start() {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart(); // 장바구니 객체 생성
        while(true) {
            System.out.println("[ Main MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategory());
            }
            System.out.println("0. 종료      | 종료\n");

            if (!cart.getMenuItems().isEmpty()) { // 장바구니에 카트가 비어있으면, 해당 값 출력 X
                System.out.println("[ Order MENU ]"); // 4,5로 지정안한 이유 물품추가될 가능성 고려해 음수로 값입력 받게함.
                System.out.println("-1. Orders      | 장바구니를 확인 후 주문합니다.");
                System.out.println("-2. Cancel      | 진행중인 주문을 취소합니다.\n");
            }
            System.out.print("카테고리를 선택하세요(종료 0): ");

            try {
                int choose = sc.nextInt();
                if (choose == 0) {
                    System.out.println("\n키오스크를 종료합니다.\n");
                    break; // 반복문 종료
                } else if (choose >= 1 && choose <= menus.size()) {
                    menus.get(choose - 1).showSubMenu();
                    int choose2 = sc.nextInt();
                    if (choose2 >= 1 && choose2 <= menus.get(choose - 1).getMenuItems().size()) { // << 해당 부분 gpt 도움받음. BoundsException 오류 발생 유일한 값 3만..
                        // 메소드 체이닝 ( . . . 연결되어서 이어지는 방식 )
                        MenuItem item = menus.get(choose - 1).getMenuItems().get(choose2 - 1);
                        System.out.println("\n 선택한 메뉴: " + item.getName() + " | " +
                                item.getPrice() + "원 | " + item.getExplain() + "를 선택하였습니다.\n");
                        cart.addCart(item); // cart에 선택한 상품 저장.
                    } else if (choose2 == 0) {
                        System.out.println();
                    } else {
                        System.out.println("\n유효하지 않은 메뉴 번호 입니다.\n");
                    }
                } else if (choose == -1) {
                    if (cart.showInfo()) { // 함수로 반환값 찾을때까지 다 읽음.
                        cart.cartReset(); // 주문 완료후 장바구니 초기화
                    }
                } else if (choose == -2) {
                    cart.cartReset();
                } else {
                    System.out.println("\n유효하지 않은 카테고리 번호 입니다. \n");
                }
            } catch (InputMismatchException e) { // 정수로 입력되지 않을시 예외처리
                System.out.println("\n해당 입력값은 유효하지 않습니다.\n");
                sc.nextLine(); // 버퍼 지우기 (안할시, 무한루프 반복됨 → 버퍼를 안지웠기 때문)
            }
        }
    }
}
