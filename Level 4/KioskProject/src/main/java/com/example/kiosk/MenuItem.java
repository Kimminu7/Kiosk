package com.example.kiosk;

public class MenuItem {

    String name;
    int price;
    String explain;

    public MenuItem(String name, int price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    void showInfo() {
        System.out.println(this.name + " | " + this.price + "원 | " + this.explain);
    }
}
