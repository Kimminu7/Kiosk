package com.example.kiosk;

public class Main {
    public static void main(String[] args) {
        // Lv 3. 객체 지향 설계를 적용해 순서 제어를 클래스로 관리하기
        // Kiosk 클래스로 관리
        Kiosk kiosk = new Kiosk();
        kiosk.start();
    }
}
