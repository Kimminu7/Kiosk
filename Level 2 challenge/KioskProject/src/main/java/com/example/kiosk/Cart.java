package com.example.kiosk;

import java.util.*;

public class Cart {
    // 장바구니 클래스를 담당한다.
    private final List<MenuItem> menuItems = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private Integer sum = 0; // 총 가격

    // 장바구니 출력 및 금액 계산
    boolean showInfo() {
        if (!menuItems.isEmpty()) { // 장바구니가 비어 있지 않으면, 정보 출력
            System.out.println("아래와 같이 주문 하시겠습니까?");
            System.out.println("[ Orders ]");

            for(int i=0; i<menuItems.size(); i++) {
                MenuItem menuItem = menuItems.get(i); // menuItem 객체 접근
                System.out.print((i+1)+ ". ");
                menuItem.showInfo();
            }
            // 스트림화 ( 현재 코드에선 for문이 훨씬더 깔끔함. )
//            IntStream.range(0, menuItems.size())
//                     .forEach(i -> {
//                         MenuItem menuItem = menuItems.get(i);
//                         System.out.print((i+1) + ". ");
//                         menuItem.showInfo();
//                     });
            System.out.println("\n[ Total ]");
//            sum = 0;  // 총합 계산;
//            for (MenuItem menuItem : menuItems) {
//                sum += menuItem.getPrice();
//            }
            // 스트림화
            sum = menuItems.stream().mapToInt(MenuItem::getPrice).sum();

            System.out.println(sum + "원\n");
            System.out.println("1. 주문       2. 메뉴판");
            discountShow();
            System.out.println("주문 하시겠습니까?(1 주문): ");
            int choose = sc.nextInt();
            if (choose == 1 && sum > 0) { // 주문시, 합계금액이 0원을 넘어야 주문가능
                System.out.println("\n주문이 완료 되었습니다. 금액은 " + sum + "원 입니다.\n");
                return true; // 튜터님 도움받아서 void 말고 boolean 으로 반환.
            }
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
            menuItems.clear();
            System.out.println("\n진행중이던 주문을 초기화 하였습니다.\n");
        } else {
            System.out.println("\n주문한 상품이 없습니다.\n");
        }
    }

    // 할인표 보여주기
    void discountShow() {
        System.out.println("\n할인 정보를 입력해주세요");
        for(int i=0; i < User.values().length; i++) { // 튜터님 도움을통해 Enum 메소드 !
            System.out.println((i+1) + ". " + User.values()[i].getUser());
        }
        // 스트림화 ( for문이 훨씬 더 깔끔 튜터님 조언 )
//        IntStream.range(0, User.values().length)
//                 .forEach(i -> {
//                     System.out.println((i+1) + ". " + User.values()[i].getUser());
//                 });

        try {
            int choose = sc.nextInt();
            if (choose == 1) {
                sum = sum - (int) (sum * User.SOLDIER.discount());
            } else if (choose == 2) {
                sum = sum - (int) (sum * User.EMPLOYEE.discount());
            } else if (choose == 3) {
                sum = sum - (int) (sum * User.STUDENT.discount());
            } else if (choose == 4) {
                sum = sum - (int) (sum * User.General.discount());
            }
            else {
                throw new Exception(); // throw문으로 예외처리를 해결 (튜터님 도움)!!
            }
        } catch (InputMismatchException e) {
            System.out.println("\n해당 입력값은 유효하지 않습니다.\n");
        } catch (Exception e) { // catch문은 여러개 작성가능하다.
            System.out.println("\n유효 하지않은 번호입니다.\n");
        }
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
