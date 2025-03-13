package com.example.kiosk;

public class Main {
    public static void main(String[] args) {
        // (도전) Lv 2. Enum, 람다 & 스트림을 활용한 주문 및 장바구니 관리
        // Menu 객체 생성하면서 카테고리 이름 설정
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        Menu burgers = new Menu("Burgers");
        // 해당 카테고리 내에 있는 목록 추가.
        burgers.addMenuItem(new MenuItem("ShackBurger", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger", 5000, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinks = new Menu("Drinks");
        drinks.addMenuItem(new MenuItem("Coke", 1500, "콜라"));
        drinks.addMenuItem(new MenuItem("ZeroCoke", 1500,"제로콜라"));
        drinks.addMenuItem(new MenuItem("Sprite", 2000, "스프라이트"));

        Menu deserts = new Menu("Deserts");
        deserts.addMenuItem(new MenuItem("Yogurt", 1000, "포동포동한 요거트!"));
        deserts.addMenuItem(new MenuItem("Candy", 500, "새콤달콤 사탕"));

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk();

        // 키오스크에 메뉴 카테고리 목록 추가.
        kiosk.addMenu(burgers);
        kiosk.addMenu(drinks);
        kiosk.addMenu(deserts);

        // Kiosk 내 시작하는 함수 호출
        kiosk.start();
    }
}
