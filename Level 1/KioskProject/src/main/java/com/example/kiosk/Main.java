package com.example.kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lv 1. 기본적인 키오스크를 프로그래밍해보자
        Scanner sc = new Scanner(System.in);

        // 무한 반복
        while(true) {
            // 메뉴판 출력
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | 6900원 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | 8900원 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | 6900원 | 포테이토 번과 비브패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | 5400원 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료      | 종료");

            // 입력 받기 ( 선택하기 )
            int choose = sc.nextInt();
            if(choose == 0) { // 0을 입력시 프로그램이 종료됨.
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choose == 1) {
                System.out.println(" ShackBurger를 선택하였습니다. ");
                break;
            } else if (choose == 2) {
                System.out.println(" SmokeShack을 선택하였습니다. ");
                break;
            } else if (choose == 3) {
                System.out.println(" Cheeseburger를 선택하였습니다. ");
                break;
            } else if (choose == 4){
                System.out.println(" Hamburger를 선택하였습니다. ");
                break;
            } else { // 그 외의 값을 입력시 "잘못된 선택 입니다" 메세지 출력.
                System.out.println(" 잘못된 선택입니다. ");
            }
        }
    }
}
