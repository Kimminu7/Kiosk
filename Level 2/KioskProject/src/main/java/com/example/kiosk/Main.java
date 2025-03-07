package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lv 2. 객체 지향 설계를 적용해 햄버거 메뉴를 클래스로 관리하기
        // List 컬렉션 선언
        List<MenuItem> menuItems = new ArrayList<>();

        // add함수로 new MenuItem(이름,가격,설명) List에 삽입
        menuItems.add(new MenuItem("ShackBurger", 6900 ,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8900 ,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6900 ,"포테이토 번과 비브패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5400 ,"비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for(int i=0; i<menuItems.size(); i++) {
                MenuItem item = menuItems.get(i); // 한 객체의 값을 직접 집어넣어주어야 하는데 캡슐화 하면 ?..
                System.out.println(i+1 + ". " + item.name + " | " + item.price + "원 | " + item.explain);
            }
            System.out.println("0. 종료      | 종료");

            int choose = sc.nextInt();
            if(choose == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choose >= 1 && choose <= 4) {
                MenuItem item = menuItems.get(choose - 1); // 인덱스는 0부터 시작하기 때문에 -1을 해야함.
                System.out.println(item.name + "를 선택하였습니다.");
                break;
            } else {
                System.out.println(" 잘못된 선택입니다. ");
            }
        }
    }
}