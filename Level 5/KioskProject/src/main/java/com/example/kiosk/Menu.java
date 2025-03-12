package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 필드 캡슐화 적용
    private String category;
    private List<MenuItem> menuItems;

    public Menu(String category) {
        this.category = category;
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    void showSubMenu() {
        System.out.println("[ " + this.category + " ]");
        for(int i=0; i<menuItems.size(); i++) {
            System.out.print((i+1) + ". ");
            menuItems.get(i).showInfo();
        }
        System.out.println("0. 뒤로가기");
        System.out.print("어떤 것을 먹을까?: ");
    }
    // set,get 함수 추가
    public String getCategory() { return category; }

    public List<MenuItem> getMenuItems() { return menuItems; }

    public void setMenuItems(List<MenuItem> menuItems) { this.menuItems = menuItems; }

    public void setCategory(String category) { this.category = category; }
}
