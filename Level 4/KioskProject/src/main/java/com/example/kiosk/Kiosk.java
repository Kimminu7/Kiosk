package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 속성
    List<Menu> menus;
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
        while(true) {
            System.out.println("[ Main MENU ]");
            for(int i=0; i<menus.size(); i++) {
                System.out.println((i+1) + ". " + menus.get(i).category);
            }
            System.out.println("0. 종료      | 종료");

            System.out.print("카테고리를 선택하세요(종료 0): ");
            int choose = sc.nextInt();
            if(choose == 0) {
                System.out.println("키오스크를 종료합니다.");
                break; // 반복문 종료
            } else if (choose >= 1 && choose <= 4) {
                menus.get(choose - 1).showSubMenu();
                int choose2 = sc.nextInt();
                if(choose2 >= 1 && choose2 <= menus.size()) {
                    // 메소드 체이닝 ( . . . 연결되어서 이어지는 방식 )
                    System.out.println("\n" + menus.get(choose - 1).menuItems.get(choose2 - 1).name + "를 선택하였습니다.\n");
                }
            } else {
                System.out.println(" 잘못된 선택입니다. ");
            }
        }
    }
}
