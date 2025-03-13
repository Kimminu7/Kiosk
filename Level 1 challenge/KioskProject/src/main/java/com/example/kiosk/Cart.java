package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    // 장바구니 클래스를 담당한다.
    private List<MenuItem> menuItems = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // 장바구니 출력 및 금액 계산
    boolean showInfo() {
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println("[ Orders ]");
        for(int i=0; i<menuItems.size(); i++) {
            MenuItem menuItem = menuItems.get(i); // menuItem 객체 접근
            System.out.println((i+1) + ". " + menuItem.getName() + " | " + menuItem.getPrice() + "원 | " + menuItem.getExplain());
        }

        System.out.println("\n[ Total ]");
        int sum = 0;  // 총합 계산;
        for (MenuItem menuItem : menuItems) {
            sum += menuItem.getPrice();
        }
        System.out.println(sum + "원\n");
        System.out.println("1. 주문       2. 메뉴판");
        int choose = sc.nextInt();
        if (choose == 1 && sum > 0) { // 주문시, 합계금액이 0원을 넘어야 주문가능
            System.out.println("\n주문이 완료 되었습니다. 금액은 " + sum + "원 입니다.\n");
            return true; // 튜터님 도움받아서 void 말고 boolean 으로 반환.
        }
        System.out.println("\n주문한 상품이 없습니다.\n");
        return false;
    }

    // 장바구니 담기
    void addCart(MenuItem menuItem) {
        menuItem.showInfo();
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        int choose = sc.nextInt();
        if (choose == 1) {
            menuItems.add(menuItem);
            System.out.println("\n" + menuItem.getName() +"이(가) 장바구니에 추가 되었습니다.\n");
        } else if (choose == 2) {
            System.out.println("\n취소 되었습니다.\n");
        } else {
            System.out.println("\n잘못된 입력 값입니다.\n");
        }
    }

    // 장바구니 초기화
    void cartReset() { // 튜터님 도움 받아서 clear 메소드를 알게됨.
        if(!menuItems.isEmpty()) { // 비어있지 않다면 초기화.
            menuItems.clear(); // 배열에 있는 모든 요소들을 전부 초기화 시킴.
            System.out.println("\n진행중이던 주문을 초기화 하였습니다.\n");
        } else {
            System.out.println("\n주문한 상품이 없습니다.\n");
        }
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
