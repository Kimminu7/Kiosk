package com.example.kiosk;

public class MenuItem {
    // 필드 캡슐화 적용
    private final String name;
    private final int price;
    private final String explain;

    public MenuItem(String name, int price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    void showInfo() {
        System.out.println(this.name + " | " + this.price + "원 | " + this.explain);
    }

    // set,get 함수 추가 ( 쓰지않는 set은 지움 )
    public String getName() { return name; }

    public int getPrice() { return price; }

    public String getExplain() { return explain; }
}
